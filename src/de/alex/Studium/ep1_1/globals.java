package de.alex.Studium.ep1_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class globals {
    public static final ArrayList<String> namen = new ArrayList<>(List.of(new String[]{"Alexander", "anderer name"}));
    public static String invert_char(String in){
        return in.length()==0 ? "" :  in.charAt(in.length()-1)+""+invert_char(in.substring(0,in.length()-1));
    }
    public static String getFromURL(String urlString, ArrayList<String> property) {
        String output = "";
        try {
            Boolean https = null;
            if(urlString.startsWith("http://"))https=false;
            if(urlString.startsWith("https://"))https=true;
            String host = !https ? urlString.split("http://")[1].split("/")[0] : urlString.split("https://")[1].split("/")[0];
            String port =https ? "443": "80";
            String org_host=host;
            if(host.contains(":")){
                port=host.split(":")[1];
                host=host.split(":")[0];
            }
            URL url = new URL( https?"https":"http",host,Integer.parseInt(port),https ? urlString.replace("http://"+org_host,"") : urlString.replace("https://"+org_host,""));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent"," Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.82 Safari/537.36");
            if(property!=null){
                HttpURLConnection finalConnection = connection;
                property.forEach(x->{
                    finalConnection.setRequestProperty(x.split(":")[0],x.replace(x.split(":")[0]+":",""));
                });
            }
            connection.setAllowUserInteraction(true);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.connect();
            BufferedReader bufferedReader =null;
            if(connection.getResponseCode()==200){
                bufferedReader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }else{
                bufferedReader= new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                output+=line+"\n";
            }
            bufferedReader.close();
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

        return output;
    }
}

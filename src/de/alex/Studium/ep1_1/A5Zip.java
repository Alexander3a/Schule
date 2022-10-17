package de.alex.Studium.ep1_1;

import java.util.ArrayList;

import static de.alex.Studium.ep1_1.globals.namen;

//Author Alexander Riedel
public class A5Zip {
    public static void main(String[] args) {
        ArrayList<String> tnamen = new ArrayList<>(namen);
        proc_next(tnamen);
    }
    public static void proc_next(ArrayList<String> namen){
        if(!namen.isEmpty()){
            if(namen.size()>=2){
                System.out.println(combine(namen.get(0),namen.get(1),""));
                namen.remove(0);
                namen.remove(0);
            }else{
                System.out.println("skipped "+namen.get(0));
                namen.remove(0);
            }
            proc_next(namen);
        }
    }

    public static String combine(String s1, String s2,String d){
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        s1=s1.substring(1);
        s2=s2.substring(1);
        if(s1.length()!=1)d+=c1+"";
        if(s2.length()!=1)d+=c2+"";
        if(s1.length()==1||s2.length()==1){
            if(s1.length()!=1)d+=s1.substring(1);
            if(s2.length()!=1)d+=s2.substring(1);
            return d;
        }
        return combine(s1, s2, d);
    }
}

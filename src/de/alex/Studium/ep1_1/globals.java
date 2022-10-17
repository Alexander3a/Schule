package de.alex.Studium.ep1_1;

import java.util.ArrayList;
import java.util.List;

public class globals {
    public static final ArrayList<String> namen = new ArrayList<>(List.of(new String[]{"Alexander", "anderer name"}));
    public static String invert_char(String in){
        return in.length()==0 ? "" :  in.charAt(in.length()-1)+""+invert_char(in.substring(0,in.length()-1));
    }
}

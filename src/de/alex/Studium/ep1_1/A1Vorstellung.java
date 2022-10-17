package de.alex.Studium.ep1_1;

//Author Alexander Riedel

import java.util.ArrayList;

import static de.alex.Studium.ep1_1.globals.*;

public class A1Vorstellung {
    public static void main(String[] args) {
        ArrayList<String> tnamen = new ArrayList<>(namen);
        print_next(tnamen,false);
        tnamen = new ArrayList<>(namen);
        print_next(tnamen,true);
    }
    public static void print_next(ArrayList<String> namen,Boolean inv){
        if(!namen.isEmpty()){
            if (inv) {
                System.out.println(invert_char(namen.get(0)));
            } else {
                System.out.println(namen.get(0));
            }
            namen.remove(0);
            print_next(namen,inv);
        }
    }
    public static String invert_char(String in){
        return in.length()==0 ? "" :  in.charAt(in.length()-1)+""+invert_char(in.substring(0,in.length()-1));
    }

}

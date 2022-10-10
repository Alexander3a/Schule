package de.alex.Studium.first;

import java.util.ArrayList;

import static de.alex.Studium.first.globals.namen;

//Author Alexander Riedel
public class A3VorstellungGesperrt {
    public static void main(String[] args) {
        ArrayList<String> tnamen = new ArrayList<>(namen);
        print_next(tnamen);
    }
    private static int alt = 0;
    public static String fuck_up_string(String in){
        alt++;
        switch (alt%2){
            case 0:
                return in;
            case 1:
                return in+" ";
            default:
                return "there is a glitch in the matrix";
        }
    }
    public static void print_next(ArrayList<String> namen){
        if(!namen.isEmpty()){
            System.out.println(process_char(namen.get(0)));
            namen.remove(0);
            print_next(namen);
        }
    }
    public static String process_char(String in){
        return in.length()==0 ? "" :  fuck_up_string(in.charAt(0)+"")+""+ process_char(in.substring(1));
    }
}

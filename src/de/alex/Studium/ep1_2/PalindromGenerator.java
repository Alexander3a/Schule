package de.alex.Studium.ep1_2;

import javax.swing.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static de.alex.Studium.ep1_1.globals.invert_char;

public class PalindromGenerator {
    public static void main(String[] args) {
        String p1 = JOptionPane.showInputDialog(null,"text 1");
        String p2 = JOptionPane.showInputDialog(null,"text 2");


        System.out.println(make_pal(p1,p2));
        System.out.println(make_pal(invert_char(p1),p2));
        System.out.println(make_pal(p1,invert_char(p2)));
        System.out.println(make_pal(p1.toUpperCase(),p2));
        System.out.println(make_pal(p1,p2.toUpperCase()));

    }
    public static String make_pal(String s1, String s2){
        String par = "";
        String pt =s1+s2;
        for (int i = 0; i < pt.length()*2; i++) {
            if(pt.length()==i)continue;
            par+=(pt+invert_char(pt)).charAt(i);
        }
        return par;
    }



}

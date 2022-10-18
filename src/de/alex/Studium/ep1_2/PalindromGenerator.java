/*
 * Copyright (c) 2022. Alexander Riedel
 */

package de.alex.Studium.ep1_2;

import javax.swing.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static de.alex.Studium.Lib.invert_char;

public class PalindromGenerator {
    public static void main(String[] args) {
        String p1 = JOptionPane.showInputDialog(null,"text 1");
        String p2 = JOptionPane.showInputDialog(null,"text 2");
        String pf = JOptionPane.showInputDialog(null,"output File name");

        StringBuilder pal=new StringBuilder();
        pal.append(make_pal(p1,p2)+"\n");
        pal.append(make_pal(invert_char(p1),p2)+"\n");
        pal.append(make_pal(p1,invert_char(p2))+"\n");
        pal.append(make_pal(p1.toUpperCase(),p2)+"\n");
        pal.append(make_pal(p1,p2.toUpperCase()));
        System.out.println(pal.toString());
        try {
            Files.write(new File(pf).toPath(),pal.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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

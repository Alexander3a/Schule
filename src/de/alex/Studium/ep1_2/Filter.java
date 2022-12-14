/*
 * Copyright (c) 2022. Alexander Riedel
 */

package de.alex.Studium.ep1_2;

import javax.swing.*;
import java.util.List;

import static de.alex.Studium.Lib.getFromURL;

public class Filter {
    public static void main(String[] args) {
        String url = JOptionPane.showInputDialog(null,"url");
        List<String> source = null;
        try {
            source = List.of(getFromURL(url, null).split("\n"));
            if(source.size()==1 && source.get(0).equals("")){
                throw new Exception("");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"invalid url");
            return;
        }
        String keyword = "Jill";
        keyword= JOptionPane.showInputDialog(null,"keyword");
        for (int i = 0; i < source.size() ; i++) {
            String s = source.get(i);
            if(s.contains(keyword)){
                final int size = 75;
                if(s.length()>size+keyword.length()){
                    String[] key_split = s.split(keyword);
                    for (int j = 0; j < key_split.length-1; j++) {
                        String befor = key_split[j];
                        String after = key_split[j+1];
                        befor= move_len(size, befor);
                        after= move_len(size, after);
                        System.out.println(befor+keyword+after);
                    }
                }else{
                    System.out.println(s);
                }
            }
        }
    }

    private static String move_len(int size, String old) {
        if(old.length()>size/2){
            String new_val ="";
            for (int j = old.length()-size/2; j < old.length(); j++) {
                new_val+=old.charAt(j);
            }
            return new_val;
        }else{
            return old;
        }
    }

}

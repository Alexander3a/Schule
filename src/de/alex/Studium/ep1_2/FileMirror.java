/*
 * Copyright (c) 2022. Alexander Riedel
 */

package de.alex.Studium.ep1_2;

import de.alex.Studium.Lib;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FileMirror {
    public static void main(String[] args) throws IOException {
        String file1= JOptionPane.showInputDialog(null,"File 1 path");
        String file2= JOptionPane.showInputDialog(null,"File 2 path");
        File f1 = new File(file1);
        File f2 = new File(file2);
        if(f1.exists() && f2.getAbsoluteFile().getParentFile().exists() && !f2.exists()){
            List<String> fs1 = Files.readAllLines(f1.toPath());
            List<String> fs2;
            if(!fs1.isEmpty()){
                fs2= fs1.stream().sorted(Comparator.comparingInt(fs1::indexOf)).collect(Collectors.toList());
                fs2.replaceAll(Lib::invert_char);
                StringBuilder c2 = new StringBuilder();
                for (String s : fs2) {
                    if(!c2.toString().equals(""))c2.append("\n");
                    c2.append(s);
                }
                Files.writeString(f2.toPath(),c2.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null,"file 1 or 2 is invalid");
        }
    }
}

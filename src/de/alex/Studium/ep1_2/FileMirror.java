package de.alex.Studium.ep1_2;

import de.alex.Studium.ep1_1.globals;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import static de.alex.Studium.ep1_1.globals.invert_char;

public class FileMirror {
    public static void main(String[] args) throws IOException {
        String file1= JOptionPane.showInputDialog(null,"File 1 absolut path");
        String file2= JOptionPane.showInputDialog(null,"File 2 absolut path");
        File f1 = new File(file1);
        File f2 = new File(file2);
        if(f1.exists() && f2.getAbsoluteFile().getParentFile().exists() && !f2.exists()){
            List<String> fs1 = Files.readAllLines(f1.toPath());
            List<String> fs2 = new LinkedList<>();
            if(!fs1.isEmpty()){
                fs2= fs1.stream().sorted(Comparator.comparingInt(x->fs1.indexOf(x))).collect(Collectors.toList());
                for (int i = 0; i < fs2.size(); i++) {
                    fs2.set(i,invert_char(fs2.get(i)));
                }
                StringBuilder c2 = new StringBuilder();
                for (String s : fs2) {
                    if(!c2.toString().equals(""))c2.append("\n");
                    c2.append(s);
                }
                Files.write(f2.toPath(),c2.toString().getBytes(StandardCharsets.UTF_8));
            }
        }else{
            JOptionPane.showMessageDialog(null,"file 1 or 2 is invalid");
        }
    }
}

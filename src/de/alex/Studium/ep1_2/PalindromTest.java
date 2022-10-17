package de.alex.Studium.ep1_2;

import javax.swing.*;
import static de.alex.Studium.ep1_1.globals.invert_char;

public class PalindromTest {
    public static void main(String[] args) {
        String inp1= JOptionPane.showInputDialog(null,"input test");
        if(inp1.equalsIgnoreCase(invert_char(inp1))){
            JOptionPane.showMessageDialog(null,"yes");
        }else{
            JOptionPane.showMessageDialog(null,"no");
        }
    }
}

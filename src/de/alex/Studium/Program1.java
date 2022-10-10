package de.alex.Studium;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("This is my first Java program");
        System.out.println("but it won't be my last.");
        StringBuilder a = new StringBuilder();
        for (String arg : args) {
            if(!a.toString().equals(""))a.append(" ");
            a.append(arg);
        }
        System.out.println(a);
    }
}
package de.alex.Studium;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("This is my first Java program");
        System.out.println( invert("but it won't be my last."));
        for (int i = 0; i < args.length; i++) {
            if(i!=0)System.out.print(" ");
            System.out.print(args[i]);
            if(i==args.length-1)System.out.print("\n");
        }
        System.out.flush();
    }
    public static String invert(String in){
        StringBuilder a = new StringBuilder(in.length());
        for (int i = 0; i < in.length(); i++) {
            a.append(in.charAt(in.length()-i-1));
        }
        return a.toString();
    }
}
package de.alex.Studium;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("This is my first Java program");
        DebugHelper d = new DebugHelper();
        d.reset_tracker();
        System.out.println( rec_invert("but it won't be my last."));
        d.debug_time("rec");
        System.out.println( invert("but it won't be my last."));
        d.debug_time("for");
//        for (int i = 0; i < args.length; i++) {
//            if(i!=0)System.out.print(" ");
//            System.out.print(args[i]);
//            if(i==args.length-1)System.out.print("\n");
//        }
//        if(args.length==1){
//            System.out.println("one");
//        }else{
//            System.out.println("not one");
//        }
//        System.out.println(args.length==1 ? "one" : "not one");
//        System.out.flush();
//        byte[] text = "text".getBytes(StandardCharsets.UTF_8);
//        System.out.println(new String(text));
//        System.out.println(Arrays.toString(make_bytes(255)));
    }
    public static void test(String ... elem){

    }
    public static String invert(String in){
        StringBuilder a = new StringBuilder(in.length());
        for (int i = 0; i < in.length(); i++) {
            a.append(in.charAt(in.length()-i-1));
        }
        return a.toString();
    }
    public static String rec_invert(String in){
        return in.length() <= 1 ? in: rec_invert(in.substring(1))+in.charAt(0);
    }
    public static byte[] make_bytes(int len){
        byte[] b = new byte[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            b[i]=(byte) Math.abs(r.nextInt(256));

        }
        return b;
    }
}
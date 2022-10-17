package de.alex.Studium.ep1_1;

import java.util.Random;

//Author Alexander Riedel
import static de.alex.Studium.ep1_1.globals.*;
public class A7VorstellungEinzeilig {
    public static void main(String[] args) {
        do_stuff(new Integer[]{11});
        System.out.println();
        System.out.flush();
    }
    public static void do_stuff(Integer[] to){
        if(to[0]==0)return;
        to[0]--;
        System.out.print(namen.get(new Random().nextInt(namen.size()))+" ");
        do_stuff(to);
    }
//    public static void main(String[] args) {
//        System.out.println(do_stuff(new Integer[]{11},""));
//    }
//    public static String do_stuff(Integer[] to,String d){
//        if(to[0]==0)return d;
//        to[0]--;
////        System.out.println(namen.get(new Random().nextInt(namen.size())));
//        d+=namen.get(new Random().nextInt(namen.size()))+" ";
//        d= do_stuff(to,d);
//        return d;
//    }
}

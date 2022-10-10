package de.alex.Studium.first;

import java.util.ArrayList;
import java.util.Random;

public class A8IntSums {
    public static void main(String[] args) {
        do_stuff(new Integer[]{3});

    }
    public static void do_stuff(Integer[] to){
        if(to[0]==0)return;
        to[0]--;
        ArrayList<Integer> list = new ArrayList<>();
        fill_with_ints(list,5);
        int alles= alles_zusammen(list);
        System.out.println(alles);
        do_stuff(to);
    }
    public static int alles_zusammen(ArrayList<Integer> ints){
        return ints.size()==0 ? 1 : ints.remove(0)*alles_zusammen(ints);
    }



    public static void fill_with_ints(ArrayList<Integer> ints,int to){
        if(ints.size()==to)return;
        ints.add(Math.abs(new Random().nextInt(256)));
        fill_with_ints(ints, to);
    }
}

package de.alex.Studium.ep1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Author Alexander Riedel
public class A6IntSums {
    public static void main(String[] args) {
        do_stuff(new Integer[]{3});

    }
    public static void do_stuff(Integer[] to){
        if(to[0]==0)return;

        ArrayList<Integer> list = new ArrayList<>();
        if(1==1){
            fill_with_ints(list,5);
        }else{
            if((to[0]%3)==0) Collections.addAll(list, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
            if((to[0]%3)==2) Collections.addAll(list, 3, 5, 11, 17, 31, 41, 59, 67, 83, 109);
            if((to[0]%3)==1) Collections.addAll(list, 5, 11, 31, 59, 127, 179, 277, 331, 431, 599);
        }
        int alles= alles_zusammen(list);
        System.out.println(alles);
        to[0]--;
        do_stuff(to);
    }
    public static int alles_zusammen(ArrayList<Integer> ints){
        return ints.size()==0 ? 0 : ints.remove(0)+alles_zusammen(ints);
    }



    public static void fill_with_ints(ArrayList<Integer> ints,int to){
        if(ints.size()==to)return;
        ints.add(Math.abs(new Random().nextInt(256)));
        fill_with_ints(ints, to);
    }
}

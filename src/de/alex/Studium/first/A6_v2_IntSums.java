package de.alex.Studium.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Author Alexander Riedel
public class A6_v2_IntSums {
    public static void main(String[] args) {
        hmm(0);
    }
    public static void hmm(int clist){
        ArrayList<Integer> list = new ArrayList<>();
        if(clist==0)Collections.addAll(list, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        if(clist==1)Collections.addAll(list, 3, 5, 11, 17, 31, 41, 59, 67, 83, 109);
        if(clist==2)Collections.addAll(list, 5, 11, 31, 59, 127, 179, 277, 331, 431, 599);
        if(clist==3)return;
        System.out.println(alles_zusammen(list));
        hmm(clist+1);
    }
    public static int alles_zusammen(ArrayList<Integer> ints){
        return ints.size()==0 ? 0 : ints.remove(0)+alles_zusammen(ints);
    }

}

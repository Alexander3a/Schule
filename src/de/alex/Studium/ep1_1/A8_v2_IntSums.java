package de.alex.Studium.ep1_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

//Author Alexander Riedel
public class A8_v2_IntSums {
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
    public static BigInteger alles_zusammen(ArrayList<Integer> ints){
        return ints.size()==0 ? BigInteger.ONE : BigInteger.valueOf(ints.remove(0)).multiply(alles_zusammen(ints));
    }

}

package de.alex.Studium.first;

import java.util.ArrayList;
import java.util.Random;

//Author Alexander Riedel
import static de.alex.Studium.first.globals.*;
public class A7VorstellungEinzeilig {
    public static void main(String[] args) {
        do_stuff(new Integer[]{11});

    }
    public static void do_stuff(Integer[] to){
        if(to[0]==0)return;
        to[0]--;
        System.out.println(namen.get(new Random().nextInt(namen.size())));
        do_stuff(to);
    }
}

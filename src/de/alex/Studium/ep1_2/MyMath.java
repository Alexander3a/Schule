/*
 * Copyright (c) 2022. Alexander Riedel
 */

package de.alex.Studium.ep1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyMath {
    public static void main(String[] args) {
        ArrayList<Object> number_list=new ArrayList<>(List.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21}));
        System.out.println(addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21));
        System.out.println(addAll(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0));
        System.out.println(addAll(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L));
        System.out.println(addAll(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f, 17f, 18f, 19f, 20f, 21f));
        System.out.println(multiplyAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21));
        System.out.println(multiplyAll(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0));
        System.out.println(multiplyAll(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L));
        System.out.println(multiplyAll(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f, 17f, 18f, 19f, 20f, 21f));
        System.out.println(catAll(1+"", 2+"", 3+"", 4+"", 5+"", 6+"", 7+"", 8+"", 9+"", 10+"", 11+"", 12+"", 13+"", 14+"", 15+"", 16+"", 17+"", 18+"", 19+"", 20+"", 21+""));
    }
    public static Object addAll(Object ... elem){
        switch (type.getType(elem[0])){
            case _int:
                int _int = 0;
                for (Object i : elem) {
                    _int+=(int)i;
                }
                return _int;
            case _long:
                long _long = 0L;
                for (Object i : elem) {
                    _long+=(long)i;
                }
                return _long;
            case _float:
                float _float = 0f;
                for (Object i : elem) {
                    _float+=(float)i;
                }
                return _float;
            case _double:
                double _double = 0.0;
                for (Object i : elem) {
                    _double+=(double)i;
                }
                return _double;
            default:
                return null;
        }

    }
    public static Object multiplyAll(Object ... elem){
        switch (type.getType(elem[0])){
            case _int:
                int _int = 1;
                for (Object i : elem) {
                    _int*=(int)i;
                }
                return _int;
            case _long:
                long _long = 1L;
                for (Object i : elem) {
                    _long*=(long)i;
                }
                return _long;
            case _float:
                float _float = 1f;
                for (Object i : elem) {
                    _float*=(float)i;
                }
                return _float;
            case _double:
                double _double = 1.1;
                for (Object i : elem) {
                    _double*=(double)i;
                }
                return _double;
            default:
                return null;
        }
    }
    public enum type{
        _int,_long,_double,_float;

        public static type getType(Object obj) {
            if(obj instanceof Integer){
                return _int;
            }
            if(obj instanceof Long){
                return _long;
            }
            if(obj instanceof Double){
                return _double;
            }
            if(obj instanceof Float){
                return _float;
            }
            return null;
        }
    }
    public static String catAll(String ... elem){
        StringBuilder a = new StringBuilder();
        for (String s : elem) {
            if(!a.toString().equals(""))a.append(",");
            a.append(s);
        }
        return a.toString();
    }
}

package de.alex.Studium.ep1_2;

public class MyMath {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(addAll(i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++));
        i = 1;
        System.out.println(multiplyAll(i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++,i++));
        i = 1;
        System.out.println(catAll(i+++""+"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++"",i+++""));
    }
    public static int addAll(int ... elem){
        int a = 0;
        for (int i : elem) {
            a+=i;
        }
        return a;
    }
    public static long multiplyAll(long ... elem){
        long a = 1;
        for (long i : elem) {
            a*=i;
        }
        return a;
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

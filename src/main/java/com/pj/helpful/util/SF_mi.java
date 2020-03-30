package com.pj.helpful.util;

public class SF_mi {
    public static long getMi(long value,int mi){
        long init=1;
        for (int i=0;i<mi;i++) {
            init*=value;
        }
        return init;
    }

    public static void main(String[] args) {
        //System.out.println(getMi(10,10));
        StringBuilder a=new StringBuilder();
        StringBuilder v=new StringBuilder();
//        a.append("abc");
//        a.append(123.9);
        String b="abc123ghijk";
        char[] chs=b.toCharArray();
        String str="";
        for (int i=0;i<chs.length;i++) {
            //str+=chs[chs.length-i-1];
            a.append(chs[chs.length-i-1]);
        }
        System.out.println(a.reverse());
        System.out.println(str);
        System.out.println("-----------");
        for (int i=0;i<16;i++) {
            v.append(i);
        }
        System.out.println(v);
    }
}

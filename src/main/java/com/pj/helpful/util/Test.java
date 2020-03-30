package com.pj.helpful.util;

import org.apache.commons.collections4.Get;

import java.util.*;

public class Test {
  // static int raw=4181;

   //获得最终的最优繁殖数列
    public static List<Long> findBestList(List<List<Long>> lists){
        List<Long> list=new ArrayList<>();
        List<Long> sizeList=new ArrayList<>();
        //
        Map<Long,List<Long>> map=new HashMap<>();
        for (List<Long> li : lists){
            map.put((long) li.size(),li);
            sizeList.add((long) li.size());
        }
//        Integer[] ins=new Integer[sizeList.size()];
//        ins= sizeList.toArray(ins);
        //找出最大的值
        //Integer max=getMax(ins);
        //System.out.println("排序前sizeList的大小==="+sizeList);
        Collections.sort(sizeList);
        //System.out.println("排序后sizeList的大小==="+sizeList);
        Long max=sizeList.get(sizeList.size()-1);
        List<Long> maxList=map.get(max);
        System.out.println("倒序：================"+maxList);
        Collections.reverse(maxList);
        return maxList;
    }
    //找出最大的值
    public static int getMax(Integer[] ins){
        int max=ins[0];
        for (int i=1;i<ins.length;i++){
            if (max<ins[i]){
                max=ins[i];
            }
        }
        return max;
    }

    //得到所有list
    public static List<Long>  findAllList(long raw){
        List<List<Long>> lists=new ArrayList<>();
        for (long i=1;i<raw;i++){
            List<Long> list=new ArrayList<>();
            list.add(raw);
           list.add(raw-i);
            //int temp=i;
            int j=3;
           while (true){
               long value=fun(j,i,raw);
               System.out.println(value);
               if (value<0){
                   break;
               }
               list.add(value);
               j++;
           }
            System.out.println("跳出while循环");
           lists.add(list);
        }
        System.out.println("跳出for循环");
        return findBestList(lists);
    }

    //得到数列中的第n个数
    //param： num 数列中的第n个数
    //param： i 第二个数raw-i
    public static long  fun(long num,long i,long raw){
        if (num==1){
            return raw;
        }
       if (num==2){
               return raw-i;
        }
        return fun(num-2,i,raw)-fun(num-1,i,raw);
    }
    public static void main(String[] args) {
       // System.out.println(fun(8,40));
        System.out.println(findAllList(1200));
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(82);
        list.add(1);
        list.add(53);
        list.add(33);
        Integer[] ins=new Integer[list.size()];
        ins= list.toArray(ins);
        Person person=new Person();
        Object o=new Object();
        String sr="sd";
        sr.compareTo("asd");
        String vv[]={"1","2"};
        for (String s : vv) {
            System.out.println(s);
        }
    }

}

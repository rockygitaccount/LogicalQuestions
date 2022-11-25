package com.practice;

import java.util.*;

public class CommonPrefix {
    public String longestCommonPrefix(String[] str)
    {
     if (str.length==0) return "";
     String prefix = str [0];
     for(int i=1; i<str.length;i++){
         while(str[i].indexOf(prefix)!=0){
             prefix=prefix.substring(0,prefix.length()-1);
         }
     }
     return prefix;
    }
    public static void main(String[] args)
    {
        CommonPrefix p = new CommonPrefix();
        String[] str = {"gopalnaik", "gopalkrishna", "gopu"};
        System.out.println(p.longestCommonPrefix(str));
    }
}
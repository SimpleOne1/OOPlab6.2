package com.company;

public class RightNumber implements Checker {
    public boolean check(String str){
    int checker=0;
    char[] var=str.toCharArray();
    for(int i=0;i<str.length();i++){
        if(i==0)
        {
            if(str.charAt(i)=='0'){
                System.out.println("Числовая последовательность начинается с 0");
                checker++;
            }
        }
        if(str.charAt(i)<'0'&& str.charAt(i)>'9')checker++;

    }
    if(checker==0)return true;
    else return false;
    }
}

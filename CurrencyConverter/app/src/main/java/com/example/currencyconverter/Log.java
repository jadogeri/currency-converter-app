package com.example.currencyconverter;

import java.util.ArrayList;

public class Log {
    private static int count;
    private String message;

    public Log() {
        this.count = 0;
        this.message = "";
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public String getMessage(String text) {
        message = getRandomMessage(text,this.getCount());
        setCount(this.getCount() + 1);
        return message;
    }

    public String getRandomMessage(String text, int count){

        if( count % 3 == 0){
            message = "Error!! : " + text + " is not a number";
        } else if (count % 4 == 0) {
            message = "Error!! : Please provide a valid number, not " + text ;
        }else{
            message = "Error!! : The input " + text + " is not a valid number";
        }

        return message;

    }


}

package com.company;

public class TooHotException extends TemperatureException{
    public String toString(){
        return "A temperatura está quente demais!";
    }
}

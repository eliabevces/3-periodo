package com.company;

public class TooColdException extends TemperatureException{
    public String toString(){
        return "A temperatura está gelada demais!!!!";
    }
}

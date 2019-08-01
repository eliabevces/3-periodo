package com.company;

import java.util.Scanner;

public class Lampada {
    private boolean estado;

    public Lampada(){
        this.estado = estado;
    }
    public void acende(){
        estado = true;
    }

    public void apaga(){
        estado = false;
    }

    public void mostrarestado(){
        if(estado==true) System.out.println("acesso");
        else System.out.println("apagado");
    }
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
	while(true){
	    Lampada lamp = new Lampada();
        System.out.println("1: acende\n2: apaga");
        a = in.nextInt();
        if(a==1) lamp.acende();
        else lamp.apaga();
        lamp.mostrarestado();
    }
    }
}

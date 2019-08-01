package com.company;

import java.util.Scanner;

public class Jovem {
    private String[] nomes[];
    private int[] idades;

    public Jovem(){
        nomes = new String[3][20];
        idades = new int[3];

    }
    public static void main(String[] args) {
        int i;
        int menor;
        int pos;
        Jovem jov = new Jovem();
        Scanner in = new Scanner(System.in);
	for(i =0;i<3;i++){
        System.out.print("escreva o "+i+"nome: ");
        jov.nomes[i][0] = in.nextLine();
        System.out.print("escreva a "+i+"idade: ");
        jov.idades[i] = in.nextInt();
    }
    menor = jov.idades[0];
	pos = 0;
    for(i=1;i<3;i++){
        if(jov.idades[i]<menor)
            menor = jov.idades[i];
            pos = i;
    }

        System.out.println("O mais nove é "+jov.nomes[pos][0]+"\n idade: "+jov.idades[pos]);

    }
}

package loja;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Loja {

    public static void main(String[] args) {
        Vendedor[] v = new Vendedor[5];
        Administrador[] a = new Administrador[5];
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        String nome, rg;
        int H;
        float[] salarioadm = new float[5];
        float sal, tvendas;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Nome: ");
            nome = in.nextLine();
            System.out.println("RG: ");
            rg = in.nextLine();
            System.out.println("Salario base: ");
            sal = in1.nextFloat();
            System.out.println("Total de vendas: ");
            tvendas = in1.nextFloat();
            v[i]= new Vendedor(nome,rg,sal);
            v[i].totalvendas(tvendas);

        }


        for (int i = 0; i < 2; i++) {
            sal = v[i].salariototal();
            System.out.println("Salario de " + v[i].getNome() + " de RG " + v[i].getRG() + " é "+ sal);
        }

        for (int i = 0; i <5 ; i++) {
            System.out.println("Nome: ");
            nome = in.nextLine();
            System.out.println("RG: ");
            rg = in.nextLine();
            System.out.println("Salario base: ");
            sal = in1.nextFloat();
            System.out.println("Total de Horas Extras: ");
            H = in1.nextInt();
            a[i]= new Administrador(nome,rg,sal);
            salarioadm[i] = a[i].salariototal(H);

        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Salario de " + a[i].getNome() + " de RG " + a[i].getRG() + " é "+ salarioadm[i]);
        }

    }
}

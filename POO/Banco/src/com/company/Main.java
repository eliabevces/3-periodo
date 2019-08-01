package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException{
        Scanner s =  new Scanner(System.in);

        System.out.print("nome do proprietario: ");
        String nome = s.nextLine();

        System.out.print("Limite de Credito: ");
        Scanner a = new Scanner(System.in);
        double limi = a.nextDouble();
        System.out.println(" ");

        Contabancaria c = new Contabancaria(limi,nome);

        while (true){
            try{

                System.out.print("1- depositar\n2-Sacar\n3-Saldo\n4-Sair\n você deseja: ");
                int op = a.nextInt();
                switch (op){
                    case 1:
                        System.out.print("Valor: ");
                        double valor = a.nextDouble();
                        c.depositar(valor);
                        System.out.println("DEPOSITADO");
                        break;
                    case 2:
                        System.out.print("Valor a sacar: ");
                        valor = a.nextDouble();
                        c.sacar(valor);
                        System.out.println("SACADO");
                        break;
                    case 3:
                        System.out.println("Seu Saldo: R$" + c.getSaldo());
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("OPÇÃO INVALIDA");
                        break;
                }
            } catch (IllegalArgumentException e ){
                JOptionPane.showMessageDialog(null,e.toString(),"ERRO",JOptionPane.ERROR_MESSAGE);
            } catch (EstourodelimiteException e){
                JOptionPane.showMessageDialog(null,e.toString(),"ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}

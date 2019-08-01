package com.company;

import java.util.Scanner;

public class Cadastro {
    private int cont;
    private String[] nome;
    private final int MAX=10;

    public Cadastro(){
        cont = 0;
        nome = new String[MAX];
    }



    public void inserir(String nome){
        if(cont<10) this.nome[cont++]=nome;
    }

    public boolean existe(String nome){
        int i;
        for(i=0;i<cont;i++){
            if(this.nome[i].equalsIgnoreCase(nome)) return true;
        }
        return false;
    }

    public int posicao(String nome){
        int i;
        for(i=0;i<cont;i++){
            if(this.nome[i].equalsIgnoreCase(nome)) return i;
        }
        return -1;
    }

    public String buscar(int pos){
        if(pos<cont) return nome[pos];
        else{
            System.out.println("nao existe esse ai nao pia");
            return null;
        }
    }

    public void excluir(int pos){
        if(pos==MAX-1){
            cont--;
        }else{
            int i;
            for(i=pos;i<cont-1;i++){
                nome[i]=nome[i+1];
            }
            cont--;
        }
    }

    public void excluir(String nome){
        int n;
        n = posicao(nome);
        if(n==-1) return;
        excluir(n);
    }

    public void imprimir(){
        for(int i=0;i<cont;i++){
            System.out.println(nome[i]);
        }
        System.out.println("\n");
    }

    public static void main(String args[]){
        Cadastro cadastro = new Cadastro();
        System.out.print("insira quantidade de nomes: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=0;i<N;i++){
            System.out.print("insira nome: ");
            Scanner a = new Scanner(System.in);
            String temp = a.nextLine();
            cadastro.inserir(temp);
        }
        cadastro.imprimir();
        System.out.print("escolha a posiçao de m nome para excluir? ");
        N = in.nextInt();
        cadastro.excluir(N-1);
        cadastro.imprimir();
    }
}

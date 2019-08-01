package com.company;

public class Contabancaria {
    private double saldo;
    private String proprietario;
    private double limite;

    public Contabancaria(double lmt, String nome){
        proprietario = nome;
        limite = lmt;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) throws IllegalArgumentException{
        if(valor<0) {
            throw new IllegalArgumentException();
        }
        else{
            saldo += valor;
        }

    }


    public void sacar(double valor) throws IllegalArgumentException, EstourodelimiteException{
        if(valor < 0 ){
            throw new IllegalArgumentException();

        }
        else{
            if(valor > saldo + limite){
                throw new EstourodelimiteException();

            }else{
                saldo -= valor;
            }
        }
    }

}

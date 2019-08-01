package com.company;
import jdk.nashorn.api.tree.CatchTree;

import javax.swing.JOptionPane;

public class Main {

    static private int obterintvalido(){
        int num=0;
        try {
            String num1 = JOptionPane.showInputDialog("Digite um numero");
            num = Integer.parseInt(num1);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "NUMERO INVALIDO "+ e.getMessage().substring(18),"ERRO",JOptionPane.ERROR_MESSAGE);
            num = obterintvalido();
        }
        return num;


    }

    static private void soma(int num1, int num2){
        int soma = 0;
            soma = num1+num2;
            JOptionPane.showMessageDialog( null, "A soma é " + soma, "SOMA", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        int num1 = obterintvalido();
        int num2 = obterintvalido();
        soma(num1,num2);


    }
}

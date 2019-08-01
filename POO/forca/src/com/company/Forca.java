import java.util.Scanner;
import javax.swing.JOptionPane;

public class Forca {
    private String frase;
    private int tamanho;
    private int vida;
    private boolean[] descoberto;

    public int getVida() {
        return vida;
    }

    public Forca(String frase){
        this.frase = frase;
        tamanho = frase.length();
        vida = 5;
        descoberto =  new boolean[tamanho];
        for(int i = 0;i<tamanho;i++){
            if(frase.charAt(i)==' ') descoberto[i]=true;
            else descoberto[i]=false;
        }
    }

    public void printar(){
        for(int i = 0; i<tamanho;i++){
            if(descoberto[i]==true) System.out.print(frase.charAt(i)+" ");
            else System.out.print("_ ");
        }
    }

    public void insere(String str){
        boolean aux = false;
        for(int i =0;i<tamanho;i++){
            if(str.toLowerCase().charAt(0)==frase.toLowerCase().charAt(i)){
                descoberto[i]= true;
                aux = true;
            }
        }
        if(aux == false){
            vida--;
            System.out.println("vida: "+vida);
        }
    }

    public boolean completo(){
        for(int i =0; i<tamanho;i++){
            if(descoberto[i]==false) return false;
        }
        JOptionPane.showMessageDialog(null,"voce ganhou!!!");
        return true;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str,a;
        System.out.print("Escreva a frase ou palavra:");
        a = in.nextLine();
        for(int i=0;i<100;i++){
            System.out.println("\n");
        }
        Forca forca = new Forca(a);
        forca.printar();
        while(forca.completo() == false){
            System.out.print("\nDigite uma letra: ");
            str = in.nextLine();
            forca.insere(str);
            if(forca.getVida() == 0){
                JOptionPane.showMessageDialog(null,"Você está morto");
                System.exit(0);
            }
            forca.printar();
        }
    }
}

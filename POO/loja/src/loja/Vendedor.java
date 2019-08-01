package loja;



public class Vendedor extends Funcionario {
    private float comissao;
    private float total = 0;

    public Vendedor(String nome, String RG, float salario){
        setNome(nome);
        setRG(RG);
        setSalario(salario);

    }
    public void totalvendas(float valor){
        total = total+valor;
    }

    public float salariototal(){
        comissao = 0.05f*total;
        total =0;
        return getSalario()+comissao;
    }


}

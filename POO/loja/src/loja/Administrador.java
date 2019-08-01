package loja;



public class Administrador extends Funcionario {

    public Administrador(String nome, String RG, float salario){
        setNome(nome);
        setRG(RG);
        setSalario(salario);

    }

    public float salariototal(int horasextras){
        float extra;

        extra = (0.01f*getSalario())*horasextras;

        return getSalario()+extra;
    }


}

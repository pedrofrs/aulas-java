package aula1.classes.exemplo1_comconstutor;

public class Cachorro {

    //atributo privado (não é possível acessar quando o objeto é instanciado)
    private String nome;

    //atributo publico (pode ser acessado quando o objeto é instanciado)
    public String dono;

    //Construtor (recebe parâmetros)
    public Cachorro(String nome, String dono){
        this.nome = nome;
        this.dono = dono;
    }

    //metodo público  (pode ser utilizado quando o objeto é instanciado)
    public void latir(){
        System.out.println("AUAUAUA");
    }

    //metodo privado (não pode ser utilizado quando o objeto é instanciado, mas pode ser utilizado dentro da própria classe)
    private void comer(){
        System.out.println("ESTOU COMENDO");
    }


    



}

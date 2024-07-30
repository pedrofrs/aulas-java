package aula1.classes.exemplo2_semconstrutor;

public class Main {
    public static void main(String[] args) {

        // Nesse caso não temos um construtor, ou seja, todos os objetos estão vazios, com atributos nulos
        Pessoa pedro = new Pessoa();
        Pessoa natalia = new Pessoa();
        Pessoa lucas = new Pessoa();


        System.out.println(pedro.anoNascimento);
        System.out.println(pedro.nome);
        System.out.println(pedro.sobreNome);

        //Para alterar os atributos precisamos mudar usando o iguall

        natalia.nome = "Natalia";
        natalia.anoNascimento = 1996;
        natalia.sobreNome = "Vitoria";

        System.out.println(natalia.nome);
        System.out.println(natalia.anoNascimento);
        System.out.println(natalia.sobreNome);


    }
}

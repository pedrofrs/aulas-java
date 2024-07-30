package aula1.classes.exemplo3_GetSet;

public class Main {
    public static void main(String[] args) {

        Cachorro apolo = new Cachorro("Apolo", "Laura");

        //Perceba que não estamos acessando um atributo diretamente, mas por um metodo feito para isso

        System.out.println(apolo.getDono());
        System.out.println(apolo.getNome());

        //Para mudar algum atributo temos o Set

        apolo.setDono("Pedro");

        System.out.println(apolo.getDono());

    }
}

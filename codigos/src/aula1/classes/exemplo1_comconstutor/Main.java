package aula1.classes.exemplo1_comconstutor;

public class Main {
    public static void main(String[] args) {

        //criando uma instancia
        Cachorro apolo = new Cachorro("Apolo", "Laura");

        //verificando o atributo do objeto
        System.out.println(apolo.dono);

        //acessando um metodo publico
        apolo.latir();

        //Podemos mudar um atributo do objeto passando novos valores;
        // antes o dono era "Laura, agora passa a ser "Pedro"
        apolo.dono = "Pedro";
        System.out.println(apolo.dono);

        //Criando novos objetos
        Cachorro kika = new Cachorro("Kika", "Andrea");
        Cachorro tor = new Cachorro("Tor", "Arthur");

        kika.latir();
        tor.latir();



    }
}

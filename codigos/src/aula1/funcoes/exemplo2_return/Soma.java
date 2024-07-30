package aula1.funcoes.exemplo2_return;

public class Soma {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Usando o método para somar dois números
        int soma = somar(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);
    }

    // Método para somar dois números
    public static int somar(int x, int y) {
        return x + y;
    }

    //Perceba que estamos atribuindo uma VARIAVEL a um METODO, ou seja, por causa do return a nosso metodo carrega algo com si
    //os metodos podem realizar processos para gente e retornar algo (valores) que podem ser utilizados no código;
}
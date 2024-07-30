package aula1.funcoes.exemplo1_void;

public class MostrarNumeros {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Usando o método para somar dois números e imprimir o resultado
        somarEImprimir(a, b);
    }

    // Método void para somar dois números e imprimir o resultado
    public static void somarEImprimir(int x, int y) {
        int soma = x + y;
        System.out.println("A soma de " + x + " e " + y + " é: " + soma);
    }

    //Perceba que agora nosso metodo faz operações dentro dele, mas NÂO CARREGA NENHUM VALOR COM SI
    //Ela apenas mostra algo, e não carrega algo. Não podemos atribuir o metodo a uma variavel
}
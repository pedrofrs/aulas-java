package aula1.funcoes.exemplo3_completo;

import java.util.Scanner;

public class Biblioteca {

    // Representação dos livros como um array de strings
    static String[] livros = new String[100];
    static int contadorLivros = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Adicionar alguns livros à biblioteca
        adicionarLivro("O Senhor dos Anéis");
        adicionarLivro("1984");
        adicionarLivro("O Pequeno Príncipe");

        // Exibir todos os livros
        exibirLivros();

        // Buscar um livro específico
        System.out.print("Digite o nome do livro que deseja buscar: ");
        String nomeLivro = scanner.nextLine();
        boolean encontrado = buscarLivro(nomeLivro);

        if (encontrado) {
            System.out.println("O livro '" + nomeLivro + "' está disponível na biblioteca.");
        } else {
            System.out.println("O livro '" + nomeLivro + "' não foi encontrado na biblioteca.");
        }

        scanner.close();
    }

    // Metodo void para adicionar um livro à biblioteca
    public static void adicionarLivro(String livro) {
        if (contadorLivros < livros.length) {
            livros[contadorLivros] = livro;
            contadorLivros++;
            System.out.println("Livro '" + livro + "' adicionado à biblioteca.");
        } else {
            System.out.println("Não é possível adicionar mais livros à biblioteca.");
        }
    }

    // Metodo void para exibir todos os livros da biblioteca
    public static void exibirLivros() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (int i = 0; i < contadorLivros; i++) {
            System.out.println("- " + livros[i]);
        }
    }

    // Metodo com return que busca um livro na biblioteca e retorna se ele foi encontrado
    public static boolean buscarLivro(String nomeLivro) {
        for (int i = 0; i < contadorLivros; i++) {
            if (livros[i].equalsIgnoreCase(nomeLivro)) {
                return true;
            }
        }
        return false;
    }
}

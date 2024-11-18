import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;


        biblioteca.adicionarLivro(new Livros("A natureza da Mordida", "Carla Madeira"));
        biblioteca.adicionarLivro(new Livros("Tudo é Rio", "Carla Madeira"));
        biblioteca.adicionarLivro(new Livros("Dom Casmurro", "Machado de Assis"));

        do {
            System.out.println("\n--- Sistema de Gerenciamento de Biblioteca ---");
            System.out.println("1. Listar Livros");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    biblioteca.listarLivros();
                    break;
                case 2:
                    System.out.print("Digite o título do livro para emprestar: ");
                    String tituloEmprestar = scanner.nextLine();
                    biblioteca.emprestarLivro(tituloEmprestar);
                    break;
                case 3:
                    System.out.print("Digite o título do livro para devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLivro(tituloDevolver);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livros> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livros livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não há livros na biblioteca.");
            return;
        }
        for (Livros livro : livros) {
            System.out.println(livro);
        }
    }

    public void emprestarLivro(String titulo) {
        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    livro.emprestar();
                    System.out.println("Você emprestou o livro: " + titulo);
                    return;
                } else {
                    System.out.println("O livro '" + titulo + "' não está disponível.");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!livro.isDisponivel()) {
                    livro.devolver();
                    System.out.println("Você devolveu o livro: " + titulo);
                    return;
                } else {
                    System.out.println("O livro '" + titulo + "' não foi emprestado.");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }
}

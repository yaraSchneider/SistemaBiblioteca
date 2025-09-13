import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Cadastrar livro
    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }

    // Emprestar livro
    public void emprestarLivro(String isbn) {
        Livro livro = buscarPorIsbn(isbn);
        if (livro != null && !livro.isEmprestado()) {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado: " + livro.getTitulo());
        } else if (livro == null) {
            System.out.println("Livro não encontrado.");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    // Devolver livro
    public void devolverLivro(String isbn) {
        Livro livro = buscarPorIsbn(isbn);
        if (livro != null && livro.isEmprestado()) {
            livro.setEmprestado(false);
            System.out.println("Livro devolvido: " + livro.getTitulo());
        } else if (livro == null) {
            System.out.println("Livro não encontrado.");
        } else {
            System.out.println("Livro não estava emprestado.");
        }
    }

    // Consultar disponibilidade
    public void consultarDisponibilidade(String isbn) {
        Livro livro = buscarPorIsbn(isbn);
        if (livro != null) {
            System.out.println(livro.getTitulo() + " está " + (livro.isEmprestado() ? "emprestado" : "disponível"));
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // Listar livros por autor
    public void listarLivrosPorAutor(String autor) {
        List<Livro> livrosDoAutor = livros.stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());

        if (livrosDoAutor.isEmpty()) {
            System.out.println("Nenhum livro encontrado do autor: " + autor);
        } else {
            System.out.println("Livros do autor " + autor + ":");
            livrosDoAutor.forEach(System.out::println);
        }
    }

    // Buscar livro por ISBN
    private Livro buscarPorIsbn(String isbn) {
        return livros.stream()
                .filter(l -> l.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    // Listar todos os livros
    public void listarTodosLivros() {
        System.out.println("\n=== LISTA DE LIVROS ===");
        livros.forEach(System.out::println);
    }
}
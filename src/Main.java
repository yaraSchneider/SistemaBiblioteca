public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Cadastrar livros
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "12345", 1954);
        Livro l2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "67890", 1997);
        Livro l3 = new Livro("O Hobbit", "J.R.R. Tolkien", "54321", 1937);

        biblioteca.cadastrarLivro(l1);
        biblioteca.cadastrarLivro(l2);
        biblioteca.cadastrarLivro(l3);

        // Listar todos os livros
        biblioteca.listarTodosLivros();

        // Emprestar livros
        biblioteca.emprestarLivro("12345"); // Tolkien
        biblioteca.emprestarLivro("67890"); // Rowling

        // Consultar disponibilidade
        biblioteca.consultarDisponibilidade("12345");
        biblioteca.consultarDisponibilidade("54321");

        // Devolver livro
        biblioteca.devolverLivro("12345");

        // Listar livros por autor
        biblioteca.listarLivrosPorAutor("J.R.R. Tolkien");

        // Listar todos os livros atualizados
        biblioteca.listarTodosLivros();
    }
}
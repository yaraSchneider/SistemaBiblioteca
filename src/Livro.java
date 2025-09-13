public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int ano;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
        this.emprestado = false;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAno() {
        return ano;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return titulo + " | Autor: " + autor + " | ISBN: " + isbn + " | Ano: " + ano +
                " | " + (emprestado ? "Emprestado" : "Disponível");
    }
}

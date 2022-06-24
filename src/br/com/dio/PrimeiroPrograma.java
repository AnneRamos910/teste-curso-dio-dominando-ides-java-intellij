package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        livro livro1 = new livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

        /*int a = 5;
         * int b = 3;
         * System.out.println("Hello Word!" + (a+b));*/


    }

    private static class livro {
        public livro() {}

        public livro(String nome, int numPaginas) {
        }
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

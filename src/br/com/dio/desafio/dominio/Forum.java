package br.com.dio.desafio.dominio;

public class Forum extends Conteudo {

    private int topicos;

    @Override
    public double calcularXp() {return xpForum * topicos;}

    public Forum() {
    }

    public int getTopicos() {return topicos;}

    public void setTopicos(int topicos) {this.topicos = topicos;}

    @Override
    public String toString() {
        return "Forum{" +
                "topicos=" + topicos +
                '}';
    }
}

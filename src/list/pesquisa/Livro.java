/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.pesquisa;

/**
 *
 * @author Windows 10 PRO
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    @Override
    public String toString() {
        return "Livro{" + "titulo='" + titulo +'\'' + ", autor='" + autor + '\''+", anoPublicacao=" + anoPublicacao + '}';
    }
    
    
    
    
    
}

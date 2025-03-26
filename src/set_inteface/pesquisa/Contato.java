/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_inteface.pesquisa;

import java.util.Objects;

/**
 *
 * @author Windows 10 PRO
 */
public class Contato {
    
    private String nome;
    
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato other = (Contato) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", numero=" + numero + '}';
    }
    
    
    
}

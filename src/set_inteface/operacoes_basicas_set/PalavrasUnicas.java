/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_inteface.operacoes_basicas_set;

import java.util.Objects;

/**
 *
 * @author Windows 10 PRO
 */
public class PalavrasUnicas {
    private String palavra;
    
    
    public PalavrasUnicas(String palavra){
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.palavra);
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
        final PalavrasUnicas other = (PalavrasUnicas) obj;
        return Objects.equals(this.palavra, other.palavra);
    }

    @Override
    public String toString() {
        return "PalavrasUnicas{" + "palavra=" + palavra + '}';
    }
    
    
}

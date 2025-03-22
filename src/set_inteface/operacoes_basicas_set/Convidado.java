/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_inteface.operacoes_basicas_set;

/**
 *
 * @author Windows 10 PRO
 */
public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigoConvite;
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
        final Convidado other = (Convidado) obj;
        return this.codigoConvite == other.codigoConvite;
    }
    
    /*outra forma de fazer o equals() and hashCode()
    informada na aula DIO - 85 - 
    
    @Override
    public boolean equals(Object o){
    if(this == o) return true;
    if(!(o instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
    }
    
    
    @Override
    public int hashCode(){
    return Objects.hash(getCodigoConvite());
    }
    */

    @Override
    public String toString() {
        return "Convidado{" + "nome=" + nome + ", codigoConvite=" + codigoConvite + '}';
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica;

/**
 *
 * @author Aline Ramos
 */
public class Servico {
    public String nome;
    public double valor;

    public Servico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString(){
        return this.nome+"    Preco: R$ "+String.format( "%.2f", this.valor )+"\n";
    }
}

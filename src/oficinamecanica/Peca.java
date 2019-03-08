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
public class Peca {
    private String nome;
    private double valor;

    public Peca(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Peca: "+this.nome+"    Preco: R$ "+String.format( "%.2f", this.valor );
    }
}

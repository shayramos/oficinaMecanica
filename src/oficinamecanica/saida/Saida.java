/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica.saida;

import oficinamecanica.cliente.Cliente;
import oficinamecanica.etc.Data;

/**
 *
 * @author nando
 */
public abstract class Saida {
    private int codigo;
    private Cliente cliente;
    private Data dataSaida;
    private double valorTotal;

    public Saida (int codigo, Cliente cliente, Data dataSaida){
        this.codigo=codigo;
        this.cliente=cliente;
        this.dataSaida=dataSaida; 
    }

    public abstract void calcValorTotal();
    public abstract void addItem(String nome, double preco);
    public abstract void removeItem(String item);
    
    @Override
    public String toString(){
        return "CODIGO: "+this.codigo+"\nCliente: "+this.cliente+"\nData de saida/venda: "+this.dataSaida+"\nValor total: R$"+String.format( "%.2f", this.valorTotal );
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @return the dataSaida
     */
    public Data getDataSaida() {
        return dataSaida;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(Data dataSaida) {
        this.dataSaida = dataSaida;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

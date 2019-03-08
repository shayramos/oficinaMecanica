/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica.saida;

import oficinamecanica.funcionario.Vendedor;
import java.util.ArrayList;
import oficinamecanica.cliente.Cliente;
import oficinamecanica.etc.Data;
import oficinamecanica.Peca;

/**
 *
 * @author Aline Ramos
 */
public class Venda extends Saida{
    public ArrayList<Peca> arrPeca;
    private Vendedor vendedor;
    
    public Venda(int codigo, Cliente cliente, int dia, int mes, int ano, Vendedor vendedor){
        super(codigo,cliente,new Data(dia,mes,ano));
        this.vendedor=vendedor;
        arrPeca= new ArrayList<>();
    }
    
    @Override
    public String toString(){
        String nota=super.toString();
        nota+= "\nVendedor: "+this.vendedor.getNome();
        for(int i=0;i<arrPeca.size();i++){
            nota+="\n"+arrPeca.get(i).toString();
        }
        return nota;
    }
    
    @Override
    public void calcValorTotal(){
        double preco=0;
        for(Peca s : arrPeca){
            preco+=s.getValor();
        }
        this.setValorTotal(preco);
    }
    
    @Override
    public void addItem(String nome, double preco){
        arrPeca.add(new Peca(nome,preco));
    }
    
    public void addItem(Peca peca){
        arrPeca.add(peca);
    }
    
    @Override
    public void removeItem(String nome){
        for(int i=0;i<arrPeca.size();i++){
            if(arrPeca.get(i).getNome().equals(nome)){
                arrPeca.remove(i);
                break;
            }
        }
    }
    
    //Sobrecarga
    public void removeItem(int i){
        arrPeca.remove(i);
    }
    
    public Peca getPecaByRef(int i){
        return arrPeca.get(i);
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}

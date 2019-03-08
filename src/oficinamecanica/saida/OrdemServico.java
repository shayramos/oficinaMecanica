/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica.saida;

import oficinamecanica.Servico;
import oficinamecanica.funcionario.Mecanico;
import java.util.ArrayList;
import oficinamecanica.cliente.Carro;
import oficinamecanica.cliente.Cliente;
import oficinamecanica.etc.Data;

/**
 *
 * @author Aline Ramos
 */
public class OrdemServico extends Saida {
    private Carro carro;

    public ArrayList<Servico> arrServico;
    private Mecanico mecanico;
    private boolean status;

    public OrdemServico(int codigo, Cliente cliente, Carro carro, Data data, Mecanico mecanico) {
        super(codigo,cliente,data);
        this.carro = carro;
        
        this.mecanico=mecanico;
        status = false;
        arrServico=new ArrayList<>();
    }
    
    @Override
    public String toString(){
        String servs = "\nServicos:\n";
        for(int i =0;i<arrServico.size();i++){
            servs+=arrServico.get(i).toString();
        }
        
        
        
        String nota=super.toString();
        nota+= "\nCarro: "+this.carro.getModelo()+"\nMecanico: "+this.mecanico.getNome()+servs;
        /*for(int i=0;i<arrServico.size();i++){
            nota+="\n"+arrServico.get(i).toString();
        }*/
        return nota;
    }
    
    @Override
    public void calcValorTotal(){
        double preco=0;
        for(Servico s : arrServico){
            preco+=s.getValor();
        }
        this.setValorTotal(preco);
    }
    
    @Override
    public void addItem(String nome, double preco){
        arrServico.add(new Servico(nome,preco));
    }
    
    public void addItem(Servico servico){
        arrServico.add(servico);
    }
    
    @Override
    public void removeItem(String nome){
        for(int i=0;i<arrServico.size();i++){
            if(arrServico.get(i).getNome().equals(nome)){
                arrServico.remove(i);
                break;
            }
        }
    }
    
    //Sobrecarga
    public void removeItem(int i){
        arrServico.remove(i);
    }
    
    
    public Servico getServicoByRef(int i){
        return arrServico.get(i);
    }
    /**
     * @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @return the mecanico
     */
    public Mecanico getMecanico() {
        return mecanico;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }


    /**
     * @param mecanico the mecanico to set
     */
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
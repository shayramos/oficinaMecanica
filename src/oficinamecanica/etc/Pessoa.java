/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica.etc;

/**
 *
 * @author nando
 */
public abstract class Pessoa {
    private String nome;
    private long cpf;
    private Data datNasc;
    
    public Pessoa(String nome, long cpf, Data datNasc){
        this.nome=nome;
        this.cpf=cpf;
        this.datNasc=datNasc;
    }
    
    public String getNome(){
        return nome;
    }
    
    public long getCpf(){
        return cpf;
    }
    
    public Data getDatNasc(){
        return datNasc;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setCpf(long cpf){
        this.cpf=cpf;
    }
    
    public void setDatNasc(Data datNasc){
        this.datNasc=datNasc;
    }
    
    @Override
    public String toString(){
        //"\n: "+
        return "Nome: "+this.nome+"\nCPF: "+this.cpf+"\nData de Nascimento: "+this.datNasc;
    }
}

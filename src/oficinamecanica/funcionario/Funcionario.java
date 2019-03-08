/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica.funcionario;

import oficinamecanica.etc.Data;
import oficinamecanica.etc.Pessoa;

/**
 *
 * @author Aline Ramos
 */
public abstract class Funcionario extends Pessoa{
    private double salario;
    private int senha;
    private boolean isBonusable;
            
    public Funcionario(String nome, long cpf, Data datNasc, double salario, int senha){
        super(nome,cpf,datNasc);
        this.salario = salario;
        isBonusable=false;
        this.senha=senha;
    }
    
    public int getSenha(){
        return senha;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public boolean getIsBonusable(){
        return isBonusable;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
    }
    
    public void setIsBonusable(boolean x){
        isBonusable=x;
    }
    
    public void setSenha(int senha){
        this.senha=senha;
    }
    
    public abstract double calcSalario(double BONUS);
    
    @Override
    public String toString(){
        return super.toString()+"\nSalario: "+this.salario;
    }
}

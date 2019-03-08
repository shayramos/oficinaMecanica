/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica.funcionario;

import oficinamecanica.etc.Data;

/**
 *
 * @author Aline Ramos
 */
public class Mecanico extends Funcionario{
    
    private int nServicos;
    
    public Mecanico(String nome, long cpf, double salario, Data datNasc,int senha){
        super(nome, cpf, datNasc, salario,senha);
        nServicos=0;
    }
    
    public int getNServicos(){
        return nServicos;
    }
    
   
    public void setNServicos(int n){
        nServicos=n;
    }
    
    public void addServico(){
        nServicos++;
    }
    
    @Override
    public double calcSalario(double BONUS){
        if (this.getIsBonusable())
            return this.getSalario()+BONUS*2;
        else
            return this.getSalario();
    }
    
    public double calcSalario(double BONUS, double TAXACOMISSAO){
        if(this.getIsBonusable())
            return this.getSalario()+BONUS+nServicos*TAXACOMISSAO;
        else
            return this.getSalario()+nServicos*TAXACOMISSAO;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nServicos realizados: "+this.nServicos;
    }
}

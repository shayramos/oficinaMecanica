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
public class Vendedor extends Funcionario{
    
    private int hrExtra;
    
    public Vendedor(String nome, long cpf, double salario, Data datNasc, int senha){
        super(nome, cpf, datNasc, salario,senha);
        hrExtra=0;
    }
    
    public int getHrExtra(){
        return hrExtra;
    }
    
    public void setHrExtra(int hr){
        hrExtra=hr;
    }
    
    public void addHrExtra(int hr){
        hrExtra+=hr;
    }
    
    @Override
    public double calcSalario(double BONUS){
        if (this.getIsBonusable())
            return this.getSalario()+BONUS*2;
        else
            return this.getSalario();
    }
    
    public double calcSalario(double BONUS, double VALORHORAEXTRA){
        if(this.getIsBonusable())
            return this.getSalario()+BONUS+hrExtra*VALORHORAEXTRA;
        else
            return this.getSalario()+hrExtra*VALORHORAEXTRA;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nHoras extra: "+this.hrExtra;
    }
}

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
public class Gerente extends Funcionario{
    
    public Gerente(int senha, String nome, long cpf, Data datNasc, double salario){
        super(nome,cpf,datNasc,salario,senha);
    }
    
    /*
    public boolean login(int senha){
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
            }
        }
    */
 

    @Override
    public double calcSalario(double BONUS){
        if (this.getIsBonusable())
            return this.getSalario()+BONUS*4;
        else
            return this.getSalario();
    }
}

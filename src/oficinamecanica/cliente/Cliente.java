/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica.cliente;

import java.util.ArrayList;
import oficinamecanica.etc.Data;
import oficinamecanica.etc.Pessoa;

/**
 *
 * @author Aline Ramos
 */
public class Cliente extends Pessoa{
    public ArrayList<Carro> arrCarro;

    public Cliente(String nome, long cpf, Data datNasc) {
        super(nome,cpf,datNasc);
        arrCarro= new ArrayList<>();
    }

    public void addCarro(Carro carro) {
        arrCarro.add(carro);
    }

    public Carro getCarroByRef(int i) {
        return arrCarro.get(i);
    }

    public ArrayList<Carro> getArrCarro() {
        return arrCarro;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nNumero de carros: "+arrCarro.size();
    }

    public Carro buscaCarro(String modelo) {
        for(int i=0;i<arrCarro.size();i++){
            if(arrCarro.get(i).getModelo().equals(modelo)){
                return arrCarro.get(i);
            }
        }
        return null;
    }
}

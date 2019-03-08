/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica.cliente;

/**
 *
 * @author Aline Ramos
 */
public class Carro {
    public String marca;
    public int anoModelo;
    public String modelo;
    public int ano;

    public Carro(String marca, int anoModelo, String modelo, int ano) {
        this.marca = marca;
        this.anoModelo = anoModelo;
        this.modelo = modelo;
        this.ano = ano;
    }

    Carro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    
}

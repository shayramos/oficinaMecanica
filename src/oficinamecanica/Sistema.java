/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica;

import oficinamecanica.etc.Data;
import oficinamecanica.cliente.Cliente;
import oficinamecanica.funcionario.Gerente;
import oficinamecanica.funcionario.Funcionario;
import oficinamecanica.funcionario.Vendedor;
import oficinamecanica.funcionario.Mecanico;
import java.util.ArrayList;
import oficinamecanica.cliente.Carro;
import oficinamecanica.saida.OrdemServico;
import oficinamecanica.saida.Venda;

/**
 *
 * @author nando
 */

public class Sistema implements TabelaValor{
    public static int codOS=1000;
    public static int codV=1000;
    private String nome;
    private ArrayList<Cliente> arrClientes;    
    private ArrayList<Servico> arrServicos;
    private ArrayList<Peca> arrPecas;
    private ArrayList<Gerente> arrGerentes;
    private ArrayList<Mecanico> arrMecanicos;
    private ArrayList<Vendedor> arrVendedores;
    private ArrayList<Venda> arrVendas;
    private ArrayList<OrdemServico> arrOrdemServicos;
    
    public Sistema(String nome){
        this.nome=nome;
        arrClientes=new ArrayList<>();
        arrServicos=new ArrayList<>();
        arrPecas=new ArrayList<>();
        arrGerentes=new ArrayList<>();
        arrMecanicos=new ArrayList<>();
        arrVendedores=new ArrayList<>();
        arrVendas = new ArrayList<>();
        arrOrdemServicos = new ArrayList<>();
    }
    
    public int buscaCliente(long cpf){
        for(int i=0;i<arrClientes.size();i++){
            if(arrClientes.get(i).getCpf()==cpf){
                //return arrClientes.get(i);
                return i;
            }
        }
        //return null;
        return -1;
    }
    
    public int buscaGerente(long cpf){
        for(int i=0;i<arrGerentes.size();i++){
            if(arrGerentes.get(i).getCpf()==cpf){
                //return arrClientes.get(i);
                return i;
            }
        }
        //return null;
        return -1;
    }
    
    public int buscaMecanico(long cpf){
        for(int i=0;i<arrMecanicos.size();i++){
            if(arrMecanicos.get(i).getCpf()==cpf){
                //return arrClientes.get(i);
                return i;
            }
        }
        //return null;
        return -1;
    }
    
    public int buscaVendedor(long cpf){
        for(int i=0;i<arrVendedores.size();i++){
            if(arrVendedores.get(i).getCpf()==cpf){
                //return arrClientes.get(i);
                return i;
            }
        }
        //return null;
        return -1;
    }
    
    public int buscaOrdemServico(int cod){
        for(int i=0;i<arrOrdemServicos.size();i++){
            if(arrOrdemServicos.get(i).getCodigo()==cod){
                //return arrClientes.get(i);
                return i;
            }
        }
        //return null;
        return -1;
    }
    
    public int buscaVendas(int cod){
        for(int i=0;i<arrVendas.size();i++){
            if(arrVendas.get(i).getCodigo()==cod){
                //return arrClientes.get(i);
                return i;
            }
        }
        //return null;
        return -1;
    }
    
    //Agregação fraca
    public void addFuncionario(Funcionario F){
        if(F instanceof Gerente)
            arrGerentes.add((Gerente)F);
        else if (F instanceof Mecanico)
            arrMecanicos.add((Mecanico)F);
        else if (F instanceof Vendedor)
            arrVendedores.add((Vendedor)F);
        
    }
    
    public void addCliente(Cliente C){
        arrClientes.add(C);
    }
    
    public void addServico(Servico S){
        arrServicos.add(S);
    }
    
    public void addPeca(Peca P){
        arrPecas.add(P);
    }
    
    /**
     * @return the arrClientes
     */
    public ArrayList<Cliente> getArrClientes() {
        return arrClientes;
    }

    /**
     * @return the arrServicos
     */
    public ArrayList<Servico> getArrServicos() {
        return arrServicos;
    }

    /**
     * @return the arrPecas
     */
    public ArrayList<Peca> getArrPecas() {
        return arrPecas;
    }

    /**
     * @return the arrGerentes
     */
    public ArrayList<Gerente> getArrGerentes() {
        return arrGerentes;
    }

    /**
     * @return the arrMecanicos
     */
    public ArrayList<Mecanico> getArrMecanicos() {
        return arrMecanicos;
    }

    /**
     * @return the arrVendedores
     */
    public ArrayList<Vendedor> getArrVendedores() {
        return arrVendedores;
    }
    
    /**
     * @return the arrVendas
     */
    public ArrayList<Venda> getArrVendas() {
        return arrVendas;
    }

    /**
     * @return the arrOrdemServicos
     */
    public ArrayList<OrdemServico> getArrOrdemServicos() {
        return arrOrdemServicos;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //OrdemServicos
    public void addOrdemServico(int codigo, Cliente cliente, Carro carro, Data data, Mecanico mecanico){
        arrOrdemServicos.add(new OrdemServico(codigo, cliente, carro, data, mecanico));
    }    
    
    public void removeOrdemServico(int cod){
        
            for(int i=0;i<arrOrdemServicos.size();i++){
                if(arrOrdemServicos.get(i).getCodigo()==cod){
                    arrOrdemServicos.remove(i);
                    break;
                }
            }
        
    }
    
    public OrdemServico getOrdemServicoByRef(int i){
        return arrOrdemServicos.get(i);
    }
            
    
    //Vendas
    public void addVendas(int codigo, Cliente cliente, int dia, int mes, int ano, Vendedor vendedor){
        arrVendas.add(new Venda(codigo, cliente, dia, mes, ano, vendedor));
    }    
    
    public void removeVenda(int cod){
        
            for(int i=0;i<arrVendas.size();i++){
                if(arrVendas.get(i).getCodigo()==cod){
                    arrVendas.remove(i);
                    break;
                }
            }
        
    }
    
    public Venda getVendaByRef(int i){
        return arrVendas.get(i);
    }
    
    //Servicos
    public void addServico(String nome, double preco){
        arrServicos.add(new Servico(nome,preco));
    }    
    
    public void removeServico(String nome){
        
            for(int i=0;i<arrServicos.size();i++){
                if(arrServicos.get(i).getNome().equals(nome)){
                    arrServicos.remove(i);
                    break;
                }
            }
        
    }
    
    public Servico getServicoByRef(int i){
        return arrServicos.get(i);
    }
    
    //Pecas
    public void addPeca(String nome, double preco){
        arrPecas.add(new Peca(nome,preco));
    }
    
    public void removePeca(String nome){
            for(int i=0;i<arrPecas.size();i++){
                if(arrPecas.get(i).getNome().equals(nome)){
                    arrPecas.remove(i);
                    break;
                }
            }
    }
    
    public Peca getPecaByRef(int i){
        return arrPecas.get(i);
    }
    
    //Clientes
    public void addCliente(String nome, long cpf, int dia,int mes,int ano){
        arrClientes.add(new Cliente(nome,cpf,new Data(dia,mes,ano)));
    }
    
    public int removeCliente(long cpf){
        
            
            for(int i=0;i<arrClientes.size();i++){
                if (arrClientes.get(i).getCpf()==cpf){
                    arrClientes.remove(i);
                    return 0;
                }
            }
            return -1;
        
    }
    
    public Cliente getClienByRef(int i){
        return arrClientes.get(i);
    }
    
    //Gerentes
    public void addGerente(int senha, String nome, long cpf, Data datNasc, double salario){
        arrGerentes.add(new Gerente(senha,nome,cpf,datNasc,salario));
    }
    
    public void removeGerente(long cpf){
        
        for(int i=0;i<arrGerentes.size();i++){
            if(arrGerentes.get(i).getCpf()==cpf){
                arrGerentes.remove(i);
                break;
            }
        }
        
    }
    
    public Gerente getGerenteByRef(int i){
        return arrGerentes.get(i);
    }
    
    //Mecanicos
    public void addMecanico(String nome, long cpf, double salario,Data datNasc, int senha){
        arrMecanicos.add(new Mecanico(nome, cpf, salario, datNasc, senha));
    }
    
    public void removeMecanico(long cpf){
        
        for(int i=0;i<arrMecanicos.size();i++){
            if(arrMecanicos.get(i).getCpf()==cpf){
                arrMecanicos.remove(i);
                break;
            }
        }
    }
    
    public Mecanico getMecanicoByRef(int i){
        return arrMecanicos.get(i);
    }
    
    //Vendedor
    public void addVendedor(String nome, long cpf, double salario,Data datNasc, int senha){
        arrVendedores.add(new Vendedor(nome, cpf, salario, datNasc, senha));
    }
    
    public void removeVendedor(long cpf){
        
        for(int i=0;i<arrVendedores.size();i++){
            if(arrVendedores.get(i).getCpf()==cpf){
                arrVendedores.remove(i);
                break;
            }
        }
        
    }
    
    public Vendedor getVendedorByRef(int i){
        return arrVendedores.get(i);
    }
    
    /*
    public int getFuncionarioByRef(int i) {
       return 0;
    }
    */
    
    public Funcionario buscaFuncionario(long CPF) {
        if(buscaGerente(CPF)!=-1)
            return this.getGerenteByRef(buscaGerente(CPF));
        else if (buscaVendedor(CPF)!=-1)
            return this.getVendedorByRef(buscaVendedor(CPF));
        else if (buscaMecanico(CPF)!=-1)
            return this.getMecanicoByRef(buscaMecanico(CPF));
        else
            return null;
    }

    public int removeFuncionario(long cpf) {
        for(int i=0;i<arrGerentes.size();i++){
            if (arrGerentes.get(i).getCpf()==cpf){
                arrGerentes.remove(i);
                return 0;
            }
        }
        
        for(int i=0;i<arrVendedores.size();i++){
            if (arrVendedores.get(i).getCpf()==cpf){
                arrVendedores.remove(i);
                return 0;
            }
        }
        
        for(int i=0;i<arrMecanicos.size();i++){
            if (arrMecanicos.get(i).getCpf()==cpf){
                arrMecanicos.remove(i);
                return 0;
            }
        }
        
        return -1;
    }

    public int buscarPeca(String s) {
        for(int i=0;i<arrPecas.size();i++){
            if(arrPecas.get(i).getNome().equals(s)){
                return i;
            }
        }
        return -1;
    }

    public int buscarServico(String s) {
        for(int i=0;i<arrServicos.size();i++){
            if(arrServicos.get(i).getNome().equals(s)){
                return i;
            }
        }
        return -1;
    }
    
}

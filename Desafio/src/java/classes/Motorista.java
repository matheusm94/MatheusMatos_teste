/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
        

public class Motorista {
    private String nome;
    private String cpf;
    private String modeloCarro;
    private int idade;
    private String sexo;
    private String estatus;

    public Motorista(String nome, String cpf, String modeloCarro, int idade, String sexo, String estatus) {
        this.nome = nome;
        this.cpf = cpf;
        this.modeloCarro = modeloCarro;
        this.idade = idade;
        this.sexo = sexo;
        this.estatus = estatus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}

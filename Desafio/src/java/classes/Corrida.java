/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Matheus
 */
public class Corrida {
    private String nomeMotorista;
    private String nomePassageiro;
    private float valor;

    public Corrida(String nomeMotorista, String nomePassageiro, float valor) {
        this.nomeMotorista = nomeMotorista;
        this.nomePassageiro = nomePassageiro;
        this.valor = valor;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}

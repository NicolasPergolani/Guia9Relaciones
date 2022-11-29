/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pergo
 */
public class Vehiculo {
    private String marca, modelo,color,tipo;
    private Integer año, nroMotor, chasis;
    private Cliente dueño;
    private Poliza polizaSeguro;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, String tipo, Integer año, Integer nroMotor, Integer chasis, Cliente dueño, Poliza polizaSeguro) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.año = año;
        this.nroMotor = nroMotor;
        this.chasis = chasis;
        this.dueño = dueño;
        this.polizaSeguro = polizaSeguro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(Integer nroMotor) {
        this.nroMotor = nroMotor;
    }

    public Integer getChasis() {
        return chasis;
    }

    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }

    public Cliente getDueño() {
        return dueño;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }

    public Poliza getPolizaSeguro() {
        return polizaSeguro;
    }

    public void setPolizaSeguro(Poliza polizaSeguro) {
        this.polizaSeguro = polizaSeguro;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", a\u00f1o=" + año + ", nroMotor=" + nroMotor + ", chasis=" + chasis + ", due\u00f1o=" + dueño + ", polizaSeguro=" + polizaSeguro + '}';
    }
    
}
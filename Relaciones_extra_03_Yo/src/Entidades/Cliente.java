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
public class Cliente {
   private String nombre, apellido, mail, domicilio,documento;
   private Double telefonoM;
   private Vehiculo auto;
   private Poliza pol;
   private Cuota cuotita;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String mail, String domicilio, String documento, Double telefonoM, Vehiculo auto, Poliza pol, Cuota cuotita) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefonoM = telefonoM;
        this.auto = auto;
        this.pol = pol;
        this.cuotita = cuotita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getTelefonoM() {
        return telefonoM;
    }

    public void setTelefonoM(Double telefonoM) {
        this.telefonoM = telefonoM;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public Poliza getPol() {
        return pol;
    }

    public void setPol(Poliza pol) {
        this.pol = pol;
    }

    public Cuota getCuotita() {
        return cuotita;
    }

    public void setCuotita(Cuota cuotita) {
        this.cuotita = cuotita;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", domicilio=" + domicilio + ", documento=" + documento + ", telefonoM=" + telefonoM + ", auto=" + auto + ", pol=" + pol + ", cuotita=" + cuotita + '}';
    }

}
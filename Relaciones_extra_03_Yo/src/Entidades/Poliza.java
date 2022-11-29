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
public class Poliza {
    private Vehiculo auto;
    private Cliente dueñito;
    private Integer nroPoliza, fechaIni,finPoli, cantCuotas, montAsegurado, montoMaxGranizo;
    private String formaPago, tipoCobertura;
    private boolean granizo;

    public Poliza() {
    }

    public Poliza(Vehiculo auto, Cliente dueñito, Integer nroPoliza, Integer fechaIni, Integer finPoli, Integer cantCuotas, Integer montAsegurado, Integer montoMaxGranizo, String formaPago, String tipoCobertura, boolean granizo) {
        this.auto = auto;
        this.dueñito = dueñito;
        this.nroPoliza = nroPoliza;
        this.fechaIni = fechaIni;
        this.finPoli = finPoli;
        this.cantCuotas = cantCuotas;
        this.montAsegurado = montAsegurado;
        this.montoMaxGranizo = montoMaxGranizo;
        this.formaPago = formaPago;
        this.tipoCobertura = tipoCobertura;
        this.granizo = granizo;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public Cliente getDueñito() {
        return dueñito;
    }

    public void setDueñito(Cliente dueñito) {
        this.dueñito = dueñito;
    }

    public Integer getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(Integer nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Integer getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Integer fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Integer getFinPoli() {
        return finPoli;
    }

    public void setFinPoli(Integer finPoli) {
        this.finPoli = finPoli;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public Integer getMontAsegurado() {
        return montAsegurado;
    }

    public void setMontAsegurado(Integer montAsegurado) {
        this.montAsegurado = montAsegurado;
    }

    public Integer getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(Integer montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "auto=" + auto + ", due\u00f1ito=" + dueñito + ", nroPoliza=" + nroPoliza + ", fechaIni=" + fechaIni + ", finPoli=" + finPoli + ", cantCuotas=" + cantCuotas + ", montAsegurado=" + montAsegurado + ", montoMaxGranizo=" + montoMaxGranizo + ", formaPago=" + formaPago + ", tipoCobertura=" + tipoCobertura + ", granizo=" + granizo + '}';
    }
    
}

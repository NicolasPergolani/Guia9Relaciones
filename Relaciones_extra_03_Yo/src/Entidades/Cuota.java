/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Pergo
 */
public class Cuota {
    private Integer nroCuota, total;
    private Date fechaVencimiento;
    private boolean cuotaPAga;
    private String formaPagoCuota;
    private Poliza poliCuota;

    public Cuota() {
    }

    public Cuota(Integer nroCuota, Integer total, Date fechaVencimiento, boolean cuotaPAga, String formaPagoCuota, Poliza poliCuota) {
        this.nroCuota = nroCuota;
        this.total = total;
        this.fechaVencimiento = fechaVencimiento;
        this.cuotaPAga = cuotaPAga;
        this.formaPagoCuota = formaPagoCuota;
        this.poliCuota = poliCuota;
    }

    public Integer getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(Integer nroCuota) {
        this.nroCuota = nroCuota;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isCuotaPAga() {
        return cuotaPAga;
    }

    public void setCuotaPAga(boolean cuotaPAga) {
        this.cuotaPAga = cuotaPAga;
    }

    public String getFormaPagoCuota() {
        return formaPagoCuota;
    }

    public void setFormaPagoCuota(String formaPagoCuota) {
        this.formaPagoCuota = formaPagoCuota;
    }

    public Poliza getPoliCuota() {
        return poliCuota;
    }

    public void setPoliCuota(Poliza poliCuota) {
        this.poliCuota = poliCuota;
    }

    @Override
    public String toString() {
        return "Cuota{" + "nroCuota=" + nroCuota + ", total=" + total + ", fechaVencimiento=" + fechaVencimiento + ", cuotaPAga=" + cuotaPAga + ", formaPagoCuota=" + formaPagoCuota + ", poliCuota=" + poliCuota + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePelicula;

/**
 *
 * @author LILIANA
 */
public class ClasePelicula {
 
    private String tituloPelicula;
    private String directorPelicula;
    private Double duracionPelicula;
    private Integer edadMinima;

    public ClasePelicula() {
    }

    public ClasePelicula(String tituloPelicula, String directorPelicula, Double duracionPelicula, Integer edadMinima) {
        this.tituloPelicula = tituloPelicula;
        this.directorPelicula = directorPelicula;
        this.duracionPelicula = duracionPelicula;
        this.edadMinima = edadMinima;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public Double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "ClasePelicula{" + "tituloPelicula=" + tituloPelicula + ", directorPelicula=" + directorPelicula + ", duracionPelicula=" + duracionPelicula + ", edadMinima=" + edadMinima + '}';
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author D4rkC0dd3r
 */
public class Titulo {
    
    //Definicion de Variables
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }
    
    
    //Creacion de metodos
    public void muestraFichaTecnica(){
        System.out.println("***Ficha Tecnica***");
        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duracion: " + getTiempoDeDuracionEnMinutos() + "Min");
    }
}

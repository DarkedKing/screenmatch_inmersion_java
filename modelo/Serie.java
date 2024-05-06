/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Serie extends Titulo{    
    
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodios;

        @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodios * episodiosPorTemporada * temporadas;
    }
    
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodios() {
        return duracionEnMinutosPorEpisodios;
    }

    public void setDuracionEnMinutosPorEpisodios(int duracionEnMinutosPorEpisodios) {
        this.duracionEnMinutosPorEpisodios = duracionEnMinutosPorEpisodios;
    }
    
    
    
}

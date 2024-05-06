/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
import modelo.Peliculas;

/**
 *
 * @author USUARIO
 */
public class Principal {
    
    public void muestraElMenu(){
        int opcion = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        while (opcion != 9){
            
            String menu = """
                          Bienvenido a ScreenMatch
                          1) Registrar nueva pelicula
                          2) Regustrar nueva Series
                          3) Calculaora de tiempo
                          9) Salir
                          """; //Hacer calculadora para poder dar que tiempo se 
            //debe emplear para maratonear las series
            
            System.out.print(menu + " Digite un numero: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcion){
                
                case 1: 
                    System.out.println("Ingrese el nombre del titulo de la pelicula: ");
                    String nombreDeLaPelicula = teclado.nextLine();
                    
                    System.out.println("Ingrese la Fecha de Lanzamiento de la pelicula: ");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    
                    System.out.println("Ingrese la duracion en minutos de la pelicula: ");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    
                    Peliculas peliculaUsuario = new Peliculas();
                    
                    peliculaUsuario.setNombre(nombreDeLaPelicula);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    
                    peliculaUsuario.muestraFichaTecnica();
                    
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Ingrese el nombre de la serie: ");
                    String nombreDeLaSerie = teclado.nextLine();
                    
                    System.out.println("Ingrese fecha de lanzamiento de la serie: ");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    
                    System.out.println("Ingrese la duracion en minutos de los episodios: ");
                    int duracionDeEpisodiosEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    
                    System.out.println("Ingrese el total de episodios por temporada");
                    break;
                    
                case 9:
                    System.out.println("Saliendo del programa");
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
            
        }
        System.out.println("***Gracias por tu contribucion!***");
    }
    
}

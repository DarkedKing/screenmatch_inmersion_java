/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenidos a la inmersion de java");
        //System.out.println("Pelicula Matrix");
        
        // Declaracion de Variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                          La mejor pelicula del fin del milenio
                          """;
        double mediaEvaluacionUsuarios = 0;
        
        
        System.out.println("Pelicula: " + nombre);
        System.out.println ("Fecha de produccion: " + fechaDeLanzamiento);
        System.out.println("Valoracion: " + evaluacion);
        System.out.println("Se incluye en el plan basico? " + incluidoEnElPlanBasico);
        
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        
        System.out.println("Media de la evaluacion de " + nombre + " " + mediaEvaluacion);
        
        //Condicionales
        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular del momento");
        }
        else{
            System.out.println("Pelicula retro que vale la pena ver");
        }
        
        for (int i=0; i<3; i++){
            System.out.println("Ingrese la nota que le darias a Matrix: ");
            Scanner teclado = new Scanner(System.in);
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuarios = mediaEvaluacionUsuarios + notaMatrix;
        }
        
        System.out.println("La media de la pelicula "
                + "Matrix calculada por el usuario es: " + mediaEvaluacionUsuarios / 3);
        int i = 0;
        
        while (i < 3) {
            System.out.println("Hola " + (i+1));
            i++;
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

/**
 *
 * @author Joel García
 */
public class EjerciciosJava {

    //Ej 1
    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //Si es fin de semana, dan igual las bellotas
        if(finDeSemana){
            return true;
        }
        //Si no es fin de semana y hay entre 40 y 60 bellotas, tiene éxito. 
        if(numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        //Si no es finde y no hay entre 40 y 60 bellotas.
        return false;
    }
    
    //Ej 2
    public int conducciónRapida(int codigo){
        return 1;
    }
    
    public static void main(String[] args) {
        EjerciciosJava ejercicio = new EjerciciosJava(); 
        System.out.println("Ejercicio 01: Ardillas");
        System.out.println("30, false:" + ejercicio.fiestaArdillas(30, false));
        System.out.println("50, false:" + ejercicio.fiestaArdillas(50, false));
        System.out.println("70, true:" + ejercicio.fiestaArdillas(70, true));
    }
    
}

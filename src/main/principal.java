
package main;

import java.util.Random;
import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        // Inicializacion de variables
        int aux1,aux2,aux3,aux4,aux5;
        String aux6;
        
        // LLamamos a la clase Random para obtener numeros aleatorios
        Random rand = new Random(System.nanoTime());
        //Llamamos a la clase scanner para introducir por pantalla
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Elige el nombre del pj1: ");
        pjs pj1 = new pjs(scan.nextLine());
        System.out.println("Elige el nombre del pj2: ");
        pjs pj2 = new pjs(scan.nextLine());
        System.out.println("Elige el nombre del pj3: ");
        pjs pj3 = new pjs(scan.nextLine());
        System.out.println("Elige el nombre del pj enemigo: ");
        pjs pj_enemigo = new pjs(scan.nextLine());
        
        System.out.println(pj1.getNombre()+" La vida es: "+pj1.getVida()+" La fuerza es: "+pj1.getFuerza()
        +" la defensa es: "+pj1.getDefensa()+" la magia es: "+pj1.getMagia()+" la defmagica es: "+pj1.getDefmagica());
        
        System.out.println(pj2.getNombre()+" La vida es: "+pj2.getVida()+" La fuerza es: "+pj2.getFuerza()
        +" la defensa es: "+pj2.getDefensa()+" la magia es: "+pj2.getMagia()+" la defmagica es: "+pj2.getDefmagica());
        
        System.out.println(pj3.getNombre()+" La vida es: "+pj3.getVida()+" La fuerza es: "+pj3.getFuerza()
        +" la defensa es: "+pj3.getDefensa()+" la magia es: "+pj3.getMagia()+" la defmagica es: "+pj3.getDefmagica());
        
        System.out.println(pj_enemigo.getNombre()+" La vida es: "+pj_enemigo.getVida()+" La fuerza es: "+pj_enemigo.getFuerza()
        +" la defensa es: "+pj_enemigo.getDefensa()+" la magia es: "+pj_enemigo.getMagia()+" la defmagica es: "+pj_enemigo.getDefmagica());
        
}
}

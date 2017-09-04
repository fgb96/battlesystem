
package main;

import java.util.Random;
import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        // Inicializacion de variables
        int aux1,aux2,aux3,aux4,aux5;
        boolean goodplayers = true,badplayers = true;
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
        +" la defensa es: "+pj1.getDefensa()+" la magia es: "+pj1.getMagia()+" la defmagica es: "+pj1.getDefmagica()+
        " Los ph son: "+pj1.getPh());
        
        System.out.println(pj2.getNombre()+" La vida es: "+pj2.getVida()+" La fuerza es: "+pj2.getFuerza()
        +" la defensa es: "+pj2.getDefensa()+" la magia es: "+pj2.getMagia()+" la defmagica es: "+pj2.getDefmagica()+
        " Los ph son: "+pj2.getPh());
        
        System.out.println(pj3.getNombre()+" La vida es: "+pj3.getVida()+" La fuerza es: "+pj3.getFuerza()
        +" la defensa es: "+pj3.getDefensa()+" la magia es: "+pj3.getMagia()+" la defmagica es: "+pj3.getDefmagica()+
        " Los ph son: "+pj3.getPh());
        
        System.out.println(pj_enemigo.getNombre()+" La vida es: "+(pj_enemigo.getVida()+1000)+" La fuerza es: "+pj_enemigo.getFuerza()
        +" la defensa es: "+pj_enemigo.getDefensa()+" la magia es: "+pj_enemigo.getMagia()+" la defmagica es: "+pj_enemigo.getDefmagica()+
        " Los ph son: "+pj_enemigo.getPh());
        
        pj_enemigo.setVida(pj_enemigo.getVida()+1000);
        
        
        do {
            for (int i = 0;i < 3; i++){
                switch (i){
                    case 0:
                        System.out.println("Es el turno de atacar de: "+pj1.getNombre());
                        System.out.println();
                        System.out.println("Ataque fisico 1");
                        System.out.println("Ataque magico 2");
                        aux1 = scan.nextInt();
                        if (aux1 == 1){
                            pj1.ataquefisico(pj1);
                            pj1.deffisico(pj_enemigo);
                        } else if (aux1 == 2) {
                            pj1.ataquemagico(pj1);
                            pj1.defmagica(pj_enemigo);
                        } else {
                            System.out.println("Tiene que elegir un valor correcto");
                            System.out.println();
                            i--;
                        }
                    break;
                    case 1:
                        System.out.println("Es el turno de atacar de: "+pj2.getNombre());
                        System.out.println();
                        System.out.println("Ataque fisico 1");
                        System.out.println("Ataque magico 2");
                        aux1 = scan.nextInt();
                        if (aux1 == 1){
                            pj2.ataquefisico(pj2);
                            pj2.deffisico(pj_enemigo);
                        } else if (aux1 == 2) {
                            pj2.ataquemagico(pj2);
                            pj2.defmagica(pj_enemigo);
                        } else {
                            System.out.println("Tiene que elegir un valor correcto");
                            System.out.println();
                            i--;
                        }
                    break;
                    case 2:
                        System.out.println("Es el turno de atacar de: "+pj3.getNombre());
                        System.out.println();
                        System.out.println("Ataque fisico 1");
                        System.out.println("Ataque magico 2");
                        aux1 = scan.nextInt();
                        if (aux1 == 1){
                            pj3.ataquefisico(pj3);
                            pj3.deffisico(pj_enemigo);
                        } else if (aux1 == 2) {
                            pj3.ataquemagico(pj3);
                            pj3.defmagica(pj_enemigo);
                        } else {
                            System.out.println("Tiene que elegir un valor correcto");
                            System.out.println();
                            i--;
                        }
                    break;
                }
                if (pj_enemigo.getVida() > 0) {
                    System.out.println("Es el turno de atacar de: "+pj_enemigo.getNombre());
                    aux1 = rand.nextInt(3);
                    if (aux1 == 0){
                        if (pj1.getVida() > 0){
                        if (pj_enemigo.getPh() <= 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj1);
                        } else {
                            aux1 = rand.nextInt(2);
                            if (aux1 == 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj1);
                            } else {
                            pj_enemigo.ataquemagico(pj_enemigo);
                            pj_enemigo.defmagica(pj1);
                            }
                        }
                        } else {
                            if (pj2.getVida() > 0){
                                if (pj_enemigo.getPh() <= 0){
                                pj_enemigo.ataquefisico(pj_enemigo);
                                pj_enemigo.deffisico(pj2);
                            } else {
                                aux1 = rand.nextInt(2);
                                if (aux1 == 0){
                                pj_enemigo.ataquefisico(pj_enemigo);
                                pj_enemigo.deffisico(pj2);
                            } else {
                                pj_enemigo.ataquemagico(pj_enemigo);
                                pj_enemigo.defmagica(pj2);
                            }
                        }
                            } else {
                                if (pj_enemigo.getPh() <= 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj3);
                        } else {
                            aux1 = rand.nextInt(2);
                            if (aux1 == 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj3);
                            } else {
                            pj_enemigo.ataquemagico(pj_enemigo);
                            pj_enemigo.defmagica(pj3);
                            }
                        }
                            }
                        }
                    } else if (aux1 == 1){
                        if (pj2.getVida() > 0 ){
                        if (pj_enemigo.getPh() <= 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj2);
                        } else {
                            aux1 = rand.nextInt(2);
                            if (aux1 == 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj2);
                            } else {
                            pj_enemigo.ataquemagico(pj_enemigo);
                            pj_enemigo.defmagica(pj2);
                            }
                        }         
                           } else if (pj3.getVida() > 0){
                            if (pj_enemigo.getPh() <= 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj3);
                        } else {
                            aux1 = rand.nextInt(2);
                            if (aux1 == 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj3);
                            } else {
                            pj_enemigo.ataquemagico(pj_enemigo);
                            pj_enemigo.defmagica(pj3);
                            }
                        }         
                        } else {
                               if (pj_enemigo.getPh() <= 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj1);
                        } else {
                            aux1 = rand.nextInt(2);
                            if (aux1 == 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj1);
                            } else {
                            pj_enemigo.ataquemagico(pj_enemigo);
                            pj_enemigo.defmagica(pj1);
                            }
                           }
                           }}
                      else {
                        if (pj3.getVida() > 0){
                        if (pj_enemigo.getPh() <= 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj3);
                        } else {
                            aux1 = rand.nextInt(2);
                            if (aux1 == 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj3);
                            } else {
                            pj_enemigo.ataquemagico(pj_enemigo);
                            pj_enemigo.defmagica(pj3);
                            }
                        }
                        } else if (pj1.getVida() > 0){
                            if (pj_enemigo.getPh() <= 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj1);
                        } else {
                            aux1 = rand.nextInt(2);
                            if (aux1 == 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj1);
                            } else {
                            pj_enemigo.ataquemagico(pj_enemigo);
                            pj_enemigo.defmagica(pj1);
                            }
                        }
                        } else {
                            if (pj_enemigo.getPh() <= 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj2);
                        } else {
                            aux1 = rand.nextInt(2);
                            if (aux1 == 0){
                            pj_enemigo.ataquefisico(pj_enemigo);
                            pj_enemigo.deffisico(pj2);
                            } else {
                            pj_enemigo.ataquemagico(pj_enemigo);
                            pj_enemigo.defmagica(pj2);
                            }
                        }
                        }
                    }
                        
                    } else {
                    badplayers = false;
                }
                if (pj1.getVida() <= 0 && pj2.getVida() <= 0 && pj3.getVida() <= 0){
                    goodplayers = false;
                }
            }
        } while (goodplayers && badplayers);
}
}

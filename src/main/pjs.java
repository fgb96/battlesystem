
package main;
import java.util.Random;
public class pjs {
    private int vida,fuerza,defensa,magia,defmagica;
    private String nombre;
    Random rand = new Random(System.nanoTime());
    
    public pjs (String nombre){
        vida = rand.nextInt(100)+200;
        fuerza = rand.nextInt(100);
        defensa = rand.nextInt(100);
        magia = rand.nextInt(100);
        defmagica = rand.nextInt(100);
        this.nombre = nombre;
    }
   

    // Get
    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getMagia() {
        return magia;
    }

    public int getDefmagica() {
        return defmagica;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Set

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public void setDefmagica(int defmagica) {
        this.defmagica = defmagica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    // Creamos el funcionamiento de ataque fisico
    
    public void ataquefisico(){
        
    }
    
}

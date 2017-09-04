
package main;
import java.util.Random;
public class pjs {
    private int vida,fuerza,defensa,magia,defmagica,salud,ph;
    boolean procede = true;
    private String nombre;
    Random rand = new Random(System.nanoTime());
    
    public pjs (String nombre){
        vida = rand.nextInt(100)+200;
        fuerza = rand.nextInt(100);
        defensa = rand.nextInt(100);
        magia = rand.nextInt(100);
        defmagica = rand.nextInt(100);
        ph = rand.nextInt(5);
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
    
    public int getPh(){
        return ph;
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
    
    public void setPh (int ph){
        this.ph = ph;
    }
    
    // Creamos el funcionamiento de ataque fisico
    
    public void ataquefisico(pjs pj){
      //  int salud = (pj.getFuerza()*2)%rand.nextInt(3);
        this.salud = pj.getFuerza();
    }
    
    public void ataquemagico(pjs pj){
        if (ph > 0){
            this.salud = pj.getMagia();
        } else {
            procede = false;
        }
        
    }
    
    public void deffisico(pjs pj){
        if (salud-pj.defensa <= 0){
            pj.vida -= 1;
             System.out.println(pj.nombre+" tiene una vida de: "+pj.vida+" Solo has conseguido causarle 1 de daño");
        } else {
        pj.vida = pj.vida-(salud-pj.defensa);
        System.out.println(pj.nombre+" tiene una vida de: "+pj.vida);
    }}
    
    public void defmagica(pjs pj){
        if (procede){
        if (salud-pj.defmagica <= 0){
            pj.vida -= 1;
            System.out.println(pj.nombre+" tiene una vida de: "+pj.vida+" Solo has conseguido causarle 1 de daño");
        } else {
        pj.vida = pj.vida-(salud-pj.defmagica);
        System.out.println(pj.nombre+" tiene una vida de: "+pj.vida);
    }} else {
       System.out.println("No has podido realizar el ataque magico");
}}
    
}


package Ejer2_Examen;
        
        public class Instalacion {


String Computos,Biblioteca,zonaVerde,lab,cancha;
public Instalacion(String Computos, String Biblioteca, String zonaVerde, String lab, String cancha) {
        this.Computos = Computos;
        this.Biblioteca = Biblioteca;
        this.zonaVerde = zonaVerde;
        this.lab = lab;
        this.cancha = cancha;
    }

    public Instalacion() {
    }

    public String getComputos() {
        System.out.println("el codigo de los computos es us22");
        return Computos;
    }

    public void setComputos(String Ccomputos) {
        this.Computos = Ccomputos;
    }

    public String getBiblioteca() {
        System.out.println("el codigo de la biblioteca es 145");
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getZonaVerde() {
        System.out.println("el codigo de la zona verde es V977");
        return zonaVerde;
    }

    public void setZonaVerde(String zonaVerde) {
        this.zonaVerde = zonaVerde;
    }

    public String getLab(){
        System.out.println("el codigo de laboratorio es L950");
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getCancha() {
        System.out.println("el codigo de la cancha es D456");
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

    
}
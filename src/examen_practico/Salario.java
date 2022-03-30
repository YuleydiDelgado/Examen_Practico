
package examen_practico;


public class Salario {
    String Nombre;
        double renta;
        double sueldo;
        double HT,PH;

    public Salario(String Nombre, double sueldo, double HT, double PH, double renta) {
        this.Nombre = Nombre;
        this.sueldo = sueldo;
        this.HT = HT;
        this.PH = PH;
        this.renta= renta;
    }

    public Salario() {
    }

    public double getHT() {
        return HT;
    }

    public void setHT(double HT) {
        this.HT = HT;
    }

    public double getPH() {
        return PH;
    }

    public void setPH(double PH) {
        this.PH = PH;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
    
   public double HorasT(){
       double HE2,HE3;
       double salario=0.0;
       
       if(this.HT<=40){
           salario=this.HT*this.PH;
       }else if(this.HT>40 &&this.HT<=48){
           HE2=HT-PH;
           salario=(40*this.HT)+(HE2*this.PH*2);
       }else if (this.HT>48){
           HE3=this.HT-48;
           salario=(40*this.PH)+(8*this.PH*2)+(HE3*this.PH*3);
       }
       return salario;
   }
public double salariob(Salario dato) {
    
    double SalarioB;
    double salariob;
    
    SalarioB= dato.HorasT();
    
    salariob=(this.sueldo+SalarioB);
    
    return salariob;
}
    public double Renta(){
        double renta;
        
       renta=(this.sueldo*10/100);
       return renta;
        
    }
    
    public double SalarioLq(Salario dato){
        double SR;
        double SB;
        double SalarioLiq;
        
        SalarioLiq=dato.Renta();
        SB=dato.salariob(dato);
        
        SR=SB-SalarioLiq;
        return SR;
        
    }
}



package Ejer2_Examen;

public class Ejercicio2{
    String ubicacion,NombreEmpleado,CantDep,CantPisos;

    public Ejercicio2(String ubicacion, String NombreEmpleado,String CantDep, String CantPisos) {
        this.ubicacion = ubicacion;
        this. NombreEmpleado = NombreEmpleado;
          this.CantDep = CantDep;
        this.CantPisos = CantPisos;
        
    }

    public Ejercicio2() {
        
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getCantDep() {
        return CantDep;
    }

    public void setCantDep(String CantDep) {
        this.CantDep = CantDep;
    }

    public String getCantPisos() {
        return CantPisos;
    }

    public void setCantPisos(String CantPisos) {
        this.CantPisos = CantPisos;
    }
      
}
    
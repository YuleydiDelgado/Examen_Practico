
package examen_practico;

import java.util.Scanner;


public class HorasTrabajadas {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        Salario s = new Salario();
        
        String nombre;
        Double sueldo;
        double HT, PH;
        
        System.out.println("Escriba su nombre: ");
        nombre=leer.nextLine();
        System.out.println("Escriba su sueldo:");
        sueldo=leer.nextDouble();
        System.out.println("Horas trabajadas en el mes: ");
        HT=leer.nextDouble();
        System.out.println("El pago por hora es:");
        PH=leer.nextDouble();
        
        s.setNombre(nombre);
        s.setSueldo(sueldo);
        s.setHT(HT);
        s.setPH(PH);
        
        System.out.println("Nombre del empleado: " + s.getNombre());
        System.out.println("Salario Bruto del empleado: "+s.salariob(s));
        System.out.println("Salario Liquido: "+s.SalarioLq(s));
        System.out.println("Rentencion del salario: "+s.Renta());
        
        
    }
    
}

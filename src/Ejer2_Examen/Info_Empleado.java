package Ejer2_Examen;

import java.util.Scanner;

        public class Info_Empleado {
            
private Scanner Teclado;
    private String Nombre,Direccion,NumeroEdificio;
    private int CargoDe,Edad;
    private double Salario,SalarioF,Renta,AFP,ISSS;
    

    
   public void inicializar() {
        Teclado=new Scanner(System.in);
        System.out.print("Escriba el nombre:");
        Nombre=Teclado.next();
        System.out.print("Ingrese la edad:");
        Edad=Teclado.nextInt();
        System.out.print("Escriba el salario bruto:");
        Salario=Teclado.nextDouble();
        System.out.print("Escriba 1 si su cargo es por servicio y 2 si es permanente:");
        CargoDe =Teclado.nextInt();
          System.out.print("Escriba su direccion:");
        Direccion=Teclado.next();
          System.out.print("Escriba Numero de edificio ");
        NumeroEdificio=Teclado.next();
       System.out.println("");
    }

    public void imprimir() {
        System.out.println("Nombre:"+Nombre+"\n");
        System.out.println("Edad:"+Edad+"\n");
         System.out.println("direccion:"+Direccion+"\n");
         System.out.println("numero de edificio :"+NumeroEdificio );
         System.out.println("");
    }
    public void cargo() {
        if (CargoDe==1) {
            Renta= (Salario * 0.10);
             SalarioF= (Salario-Renta);
             System.out.println("");
            System.out.print("su cargo es por servicio y su salario final es :"+ SalarioF);
             System.out.println("");
            
        } else if(CargoDe==2){
             Renta= (Salario * 0.10);
             ISSS= (Salario* 0.14);
             AFP= (Salario * 0.10);
             SalarioF= (Salario-Renta-ISSS-AFP);
             System.out.println("");
            System.out.print(" Su cargo es permanente y su salario final es :"+SalarioF);
                    System.out.println("");
        }
        }
    public static void main(String[] args) {
        Ejercicio2 objeto= new Ejercicio2();
      Info_Empleado Dpersona1;
        Dpersona1=new Info_Empleado();
        Dpersona1.inicializar();
        Dpersona1.imprimir();
        Dpersona1.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNombreEmpleado();
        objeto.getCantDep();
        objeto.getCantPisos();
        
        System.out.println("");
         
         Instalacion  codigo= new Instalacion();
         codigo.getComputos();
         codigo.getBiblioteca();
         codigo.getCancha();
         codigo.getLab();
         codigo.getZonaVerde();
    }
}
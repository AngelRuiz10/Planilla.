/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla;
 import java.awt.*;
 import java.util.Scanner;
 import java.util.Random;
/**
 *
 * @author Angel
 */
public class Planilla {
    
    
    public void  departamentos(){
        
        Scanner teclado = new Scanner(System.in);
        String [] depart = {"Contabilidad\t", "Tesoreria\t", "Recursos Humanos\t", "Informatica\t","Archivo\n"};
        String [] nom = new String[5];
        int aleatorio[]= new int [5];
        Random ale = new Random();
        int lineas = 0; 
        int sueldo=0,sueldoT=0;
        
        System.out.println("---Departamentos---");
        for (int i = 0; i < depart.length; i++){
            System.out.print(depart[i]);
    }
        System.out.println("---Empleados---");
        for (int i = 0; i<nom.length;i++){
            System.out.print("Ingrese el nombre: ");
            nom[i]=teclado.nextLine();
        }
        System.out.println("---SueldoBase---");
        for (int x = 0; x<5; x++){
             aleatorio[x] = (int)(Math.random()* 5+1); //generamos numeros aleatorios entre 0 y 5
             System.out.println("no."+x+"->"+aleatorio[x]);  
             sueldo+=aleatorio[x];
        }
        System.out.print("El resultado es "+sueldo+"\n");
        System.out.println("---TotalDeducciones---");
        for (int x = 0; x<5; x++){
             aleatorio[x] = (int)(Math.random()* 5+1); //generamos numeros aleatorios entre 0 y 5
             System.out.println("no."+x+"->"+aleatorio[x]);     
        }
         System.out.println("---TotalPercepciones---");
          for (int x = 0; x<5; x++){
             aleatorio[x] = (int)(Math.random()* 5+1); //generamos numeros aleatorios entre 0 y 5
             System.out.println("no."+x+"->"+aleatorio[x]);   
        }
          System.out.println("---SueldoLíquido---");
          sueldoT+=sueldo;
          System.out.println(sueldoT);
        
    
    }
    
    public static void main(String[] args) {
        Planilla pla = new Planilla();
        pla.departamentos();
    }


    
}
   




//
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla;
 import java.awt.*;
 import java.util.Scanner;
 import java.util.Random;
/**
 *
 * @author Angel
 */
public class Planilla {
    
    
    public void  departamentos(){
        
        Scanner teclado = new Scanner(System.in);
        String [] depart = {"Contabilidad", "Tesoreria", "RR.HH  ", "Informatica","Archivo"};
        String [] nom = new String[5];
       
        int aleatorio[]= new int [5];
        Random ale = new Random();
        int lineas = 0; 
        int sueldo1=0,sueldo2=0,sueldo3=0,sueldoT=0;
        
        System.out.println("Departamentos     Empleados    SueldoBase");
         
         for (int i = 0; i < depart.length; i++){
              System.out.print(depart[i]+"  ");
              for (int j = 0; j < depart.length; j++){
              }
              System.out.print("\tIngrese el nombre: ");
              nom[i]=teclado.nextLine();
         }  
    }
    public void matrizaleatoria(){
        int matriz[][] = new int[5][6];
        int sumafila=0;
        int boni = 250;
        double igss = (4.83/100);
        
        System.out.print("SB\t  Bonificacion\t   Comisiones "
                + "\t\tIGSS\t\tBT\t\tISR");
        System.out.print("\n");
        
        for (int x=0; x < matriz.length; x++) {
            int calculo=0;
                 matriz[x][0] = (int) (Math.random()*(15000-2600+1)+2600);    //Sueldo Base
                  matriz[x][1] = boni;                                        //Bonificacion
                   matriz[x][2] =  (int) (Math.random()*(1000-300+1)+300);    //Comisiones
                    matriz[x][3] = (int) (matriz[x][0]*igss);                 //IGSS
                     matriz[x][4] = (int) (Math.random()*(1000-2000+1)+2000); //Banco Trabajadores
                        //ISR
                       


                     if (matriz[x][0] >= 2600 && matriz[x][0] <5000){
                        calculo = (int) (matriz[x][5]*0.03);
                     }else if (matriz[x][0] >= 500 && matriz[x][0] <10000){
                         calculo = (int) (matriz[x][5]*0.05);
                     }
                     else if (matriz[x][0] >= 10000 && matriz[x][0] <=15000){
                         calculo = (int) (matriz[x][5]*0.10);
                     }
                        matriz[x][5] = calculo; 
                      
             
         }
         for (int x=0; x < matriz.length; x++) {
              for (int y=0; y < matriz[x].length; y++) {
                  System.out.print(matriz[x][y] +"\t\t");
              }
              System.out.println();
         } 
         
         
         for (int x=0; x < 5; x++){
             int y = 0;
             sumafila+= matriz[y][x];
         }
         System.out.println("La suma de la fila es "+sumafila);
        
        
        
    }
    
    public static void main(String[] args) {
        Planilla pla = new Planilla();
        pla.departamentos();
        pla.matrizaleatoria();
    }
}

    

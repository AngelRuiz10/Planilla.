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
   

    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla;
 import java.awt.*;
 import java.util.Scanner;
 import java.util.Random;
 import javax.swing.JOptionPane;
/**
 *
 * @author Angel
 */
//
public class Planilla {
    Scanner teclado = new Scanner(System.in);
    String [] depart = {"Contabilidad", "Tesoreria", "RR.HH  ", "Informatica","Archivo"};
    String [] nombres = {"Carlos", "Felipe", "Santiago", "Monica","Yeimy   "};
    int matriz[][] = new int[5][7]; 
    int calculoISR=0;
    
    public void  departamentos(){
        System.out.println("*DEPARTAMENTOS*      *EMPLEADOS*");

        for (int x=0; x <5; x++) {
            System.out.print(depart[x]+"  \t\t");
            System.out.println(nombres[x]+"  \t");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
    
    public void matrizaleatoria(){ //CLASE PARA GENERAR LA MATRIZ
        int boni = 250;
        int  devengado=0;
        double igss = (4.83/100);
        
        System.out.print("SueldoB\t  Bonificacion\t   Comisiones "
                + "\t\tIGSS\t\tBancoT\t\tISR\t    SueldoLiquido\n");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.print("\n");
        
        //Empieza a recorrer la matriz realizando las operaciones
        for (int x=0; x < matriz.length; x++) {
           
                 matriz[x][0] = (int) (Math.random()*(12000-2600+1)+2600);       //Sueldo Base
                  matriz[x][1] = boni;                                           //Bonificacion
                   matriz[x][2] =  (int) (Math.random()*(1000-300+1)+300);       //Comisiones
                    matriz[x][3] = (int) (matriz[x][0]*igss);                    //IGSS
                     matriz[x][4] = (int) (Math.random()*(1000-2000+1)+2000);    //Banco Trabajadores
       
                    
                    //Calculo del ISR
                    
                    if (matriz[x][0] >= 2600 && matriz[x][0] <5000){
                        calculoISR = (int) (matriz[x][0]*0.03);
                     }else if (matriz[x][0] >= 5000 && matriz[x][0] <10000){
                         calculoISR = (int) (matriz[x][0]*0.05);
                     }
                     else if (matriz[x][0] >= 10000 && matriz[x][0] <=12000){
                         calculoISR = (int) (matriz[x][0]*0.10);
                     }
                    //Confirmacion para verificar si se le aplica el ISR si es 'afectado' se cobrara el ISR, si no es 'afectado' no se le cobrara nada.
                    if (JOptionPane.showConfirmDialog(null,"   ¿Es afectado? "+nombres[x],"  AFECTADOS POR EL ISR",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                         matriz[x][5] = calculoISR;
                     } else {
                        matriz[x][5] = (calculoISR*0);
                     }
                        //Calculo del sueldo Líquido
                        devengado = matriz[x][0]+matriz[x][1]+matriz[x][2]-matriz[x][3]-matriz[x][4]-matriz[x][5]; 
                        devengado = matriz[x][0]+matriz[x][1]+matriz[x][2]-matriz[x][3]-matriz[x][4]-matriz[x][5];
                        devengado = matriz[x][0]+matriz[x][1]+matriz[x][2]-matriz[x][3]-matriz[x][4]-matriz[x][5];
                        devengado = matriz[x][0]+matriz[x][1]+matriz[x][2]-matriz[x][3]-matriz[x][4]-matriz[x][5];
                        devengado = matriz[x][0]+matriz[x][1]+matriz[x][2]-matriz[x][3]-matriz[x][4]-matriz[x][5];
                        matriz[x][6]=devengado;
        }
        //Imprimir la matriz
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] +"\t\t");
              }
              System.out.println();
         } 
    }
    
    public static void main(String[] args) {
        //llamada de los metodos
        Planilla pla = new Planilla();
        pla.departamentos();
        pla.matrizaleatoria();
    }
}
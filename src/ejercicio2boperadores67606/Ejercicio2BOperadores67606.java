/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2boperadores67606;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class Ejercicio2BOperadores67606 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1=0;
         int valor2=0;
         int valor3=0;
         int valor4=0;
         int resultado=0;
         Scanner matriz = new Scanner(System.in);
         System.out.println("INGRESA UN PRIMER VALOR:");
        valor1= matriz.nextInt();
        
        //LEER UN SEGUNDO VALOR                           //EJEMPLO DE COMO ESTARIA ACOMODADO EN UNA MATRIZ DE 2*2
        System.out.println("INGRESA UN SEGUNDO VALOR :"); //valor1  valor2                                           
        valor2= matriz.nextInt();                         //valor3  valor4
                                                          
        //LEER UN TERCER VALOR
        System.out.println("INGRESA UN TERCER VALOR:");
        valor3= matriz.nextInt();
        
        //LEER UN CUARTO VALOR
        System.out.println("INGRESA UN CUARTO VALOR :");
        valor4= matriz.nextInt();
        
        resultado= (valor1 * valor4)-(valor2*valor3);
        System.out.println("LA DETERMINADA ES: "+ resultado );
        System.out.println("LA DETERMINADA ES (PRIMER VALOR * CUARTO VALOR)-(SEGUNDO VALOR*TERCER VALOR)");
        
    }
    
}

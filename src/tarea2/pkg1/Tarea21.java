/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2.pkg1;

/**
 *
 * @author HP PC
 */
public class Tarea21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {45,1,10,30,25};
        mediana(numeros,10);
        if(numeros.length%2==0){
            int mitad=numeros.length/2;
            System.out.println("La mediana es " + ((numeros[mitad]+numeros[mitad+1])/2));
        }
        else{
            int mitad=numeros.length/2;
            System.out.println("La mediana es " + (numeros[mitad]));
        }
    }
    static void mediana(int enteros[], int valor){
        int count=0;
        for (int i = 0; i < enteros.length; i++) {
            if(enteros[i]<valor){
                int temp=enteros[count];
                enteros[count]=enteros[i];
                enteros[i]=temp;
                count++;
            }
        }
        for (int i = count; i < enteros.length; i++) {
            if(enteros[i]==valor){
                int temp=enteros[i];
                enteros[i]=enteros[count];
                enteros[count]=temp;
                count++;
            }
        }
    }
    
}

package matricula;
import java.util.Scanner;

public class Matricula {
    public static void main(String[] args) {
        int ValorMat=3500000,tiempo;
        double Total;
        Scanner Leer_tiempo= new Scanner(System.in);
        System.out.println ("Escriba el tiempo anticipado en días en pagar matrícula ");
        tiempo= Leer_tiempo.nextInt();
        if (tiempo>60) {
            Total= (ValorMat * 0.80);
            System.out.println ("Tiene un descuento del 20%, su valor total de la matrícula es de "+Total);}
        else{
            if (tiempo>30) {
            Total= (ValorMat* 0.90);
             System.out.println ("Tiene un descuento del 10%, su valor total de la matrícula es de "+Total);}
              else{
                if (tiempo>7) {
                    System.out.println ("No tiene descuento");
                }
                 else{
                if (tiempo==0){
                    Total= (ValorMat * 1.07);
                    System.out.println ("Tiene un incremento del 7%, su valor total de la matrícula es de " +Total);}
            }
        }
        
    } 
    
}}

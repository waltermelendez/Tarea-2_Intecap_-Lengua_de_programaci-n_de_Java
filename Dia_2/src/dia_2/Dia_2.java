
package dia_2;

import java.util.Scanner;


public class Dia_2 {

    
    public static void main(String[] args) {
        
        
        
        int num1, num2;
        System.out.println("ingrese un numero"); 
        Scanner a1 = new Scanner (System.in);
        num1 = a1.nextInt();
        System.out.println("ingrese otro numero");
        Scanner a3 = new Scanner (System.in);
        num2 = a3.nextInt();
        
        if (num1 == num2)
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("No son iguales");
        }
        System.out.println("segundo");
     //segundo
        
        double numero;
        System.out.println("Ingrese un numero");
        Scanner a2 = new Scanner (System.in);
        numero = a2.nextInt();
        if (numero < 0)
        {
            System.out.println("es negativo");
        }
        else if (numero == 0){
            System.out.println("el cero no es ni positivo ni negativo");
        }else
        {
            System.out.println("Es positivo");
        }
        
        System.out.println("tercero");
        //tercero
        int uno, dos;
        System.out.println("ingrese un numero"); 
        Scanner a4 = new Scanner (System.in);
        uno = a4.nextInt();
        System.out.println("ingrese otro numero");
        Scanner a5 = new Scanner (System.in);
        dos = a5.nextInt();
        if (uno > dos )
        {
            System.out.println("el orden es " + uno + " y " + dos);
        }else 
        {
            System.out.println("el orden es " + dos + " y " + uno);
        }
        
        //cuarto
         int one, two, three;
        System.out.println("ingrese un numero");
        Scanner b1 = new Scanner (System.in);
        one = b1.nextInt();
        System.out.println("ingrese otro numero");
        Scanner b2 = new Scanner (System.in);
        two = b2.nextInt();
        System.out.println("ingrese un ultimo numero");
        Scanner b3 = new Scanner (System.in);
        three = b3.nextInt();
        
                if ((one > two) && (one > three) && (two > three)){
                System.out.println(one  +" , " +two+ " y " + three);
                }
                
                else  if ((one > two) && (two > three) && (one > three)) {
                System.out.println(one + " , " + three + " y "+ two);
                }
                
                else  if ((two > one) && (two > three) && (one > three)){
                System.out.println(two + " , " + one + " y " + three);
                }
                
                else if ((two > one) && (one > three) && (two > three)) {
                System.out.println(two + " , " + three + " y " + one);
                }
                
                else  if ((three > one) && (three > two) && (two > one)){
                System.out.println(three + " , " + two + " y " + one);
                }
                else   {
                System.out.println(three + " , " + one + " y " + two);
                }
        //cinco
        int f, m, a;
        Scanner F = new Scanner (System.in);
        System.out.println("ingrese una fecha");
        f =F.nextInt();
        Scanner M = new Scanner (System.in);
        System.out.println("ingrese un mes en numeros");
        m = M.nextInt();
        Scanner A = new Scanner (System.in);
        System.out.println("ingrese un año ");
        a = A.nextInt();
        
        switch (m){
            case 1:
                if ((f <= 31) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " enero de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 2:
                if ((f <= 28) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " febrero de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 3:
                if ((f <= 31) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " marzo de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 4:
               if ((f <= 30) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " abril de " + a);
                }else {
                    System.out.println("un valor esta mal");
                } 
                break;
            case 5:
                if ((f <= 31) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " mayo de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 6:
                if ((f <= 30) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " junio de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 7:
                if ((f <= 31) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " julio de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 8:
                if ((f <= 31) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " agosto de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 9:
                if ((f <= 30) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " septiembre de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 10:
                if ((f <= 31) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " octubre de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 11:
                if ((f <= 30) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " noviembre de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            case 12:
                if ((f <= 31) && (f > 0) && (a >= 1995)){
                System.out.println("es " + f + " diciembre de " + a);
                }else {
                    System.out.println("un valor esta mal");
                }
                break;
            default:
                System.out.println(" El numero esta fuera del rango");
        }
       
            
        
    }
    
}

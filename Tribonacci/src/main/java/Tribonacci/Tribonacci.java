package Tribonacci;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Tribonacci 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
     
        
        System.out.println("Ingrese la cantidad de numeros que quiere en la sucesión de Tribonacci");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("   El resultado del tribonacci es: " + Tribonacci(numero));   
    }
    
    public static int Tribonacci(int n)
    {
        System.out.println("");
        if (n >= 3)
        {
            return CalculandoTri(0, n, 0, 0, 1);
        }
        else if (n == 2)
        {
            System.out.println("0, 0");;
        }
        else if (n == 1)
        {
            System.out.println("0");
        }
        
    }
    
    /*
     el método CalculandoTri recibe como parámetros un contador que se inicia en cero
     cont = 0
     n = el numero que que ingresa el usuario (número de datos que quiere de la sucesión
     A = 0, b = 0 y c = 1, casos base de la sucesión
    */
    public static int CalculandoTri(int cont, int n, int a, int b, int c)
    {
       int d;
       d = a + b + c;
       if (cont == 0)
       {
           System.out.print("0, 0, 1, ");
       }
       if (n >= 4)
       {
          System.out.print(d + ",  ");
          return CalculandoTri(cont+1, n-1, a = b, b = c,  c = d);
       }
     }
}

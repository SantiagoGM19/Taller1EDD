package Numerologia;
import java.util.Scanner;

public class Numerologia 
{
     public static void main(String[] args)
    {
        String n;
        int tamaño, suma;
        suma = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el número que quiere numerologiar: ");
        n = read.nextLine();
       
         tamaño = n.length();
        
        System.out.println("El resultado del calculo numerológico es: " + Numerologiar(n, tamaño, suma));
        
    }
    
     /*
        parametros ---> n = numero ingresado por el usuario que se recibe como string y luego
                                      se pasa a integer
                                tamaño = es la cantidad de numeros del numero ingresado
                                suma = 0 la suma que se retorna al momento de ser menor que 10
     */
     
    public static int Numerologiar(String n, int tamaño, int suma)
    {
        int aux;
        String substring;
             
        if (tamaño > 0)
        {
            substring = n.substring(tamaño-1, tamaño);
            aux = Integer.parseInt(substring);
            suma += aux;
            return Numerologiar(n, tamaño-1, suma);
        }
        else if (suma >= 10)
        {
            n = String.valueOf(suma);
            tamaño = n.length();
            suma = 0;
            return Numerologiar(n, tamaño, suma);
        }
        else
        {
            return suma;
        }
        
    }
    
}

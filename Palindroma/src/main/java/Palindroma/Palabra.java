package Palindroma;
import java.util.Scanner;

public class Palabra 
{              
    public static void main(String[] args)
    {
            String palabra;
            int n, cont, verificados, aux;
            cont = 0;
            verificados = 0;

            Scanner read = new Scanner(System.in);

            System.out.println("Ingrese una palabra para saber si es palindroma o no");
            palabra = read.nextLine();

            n = palabra.length();
            aux = n;
            if (palindroma(aux, verificados, cont, palabra, n) == true)
            {
                System.out.println("La palabra es palindroma");
            }
            else
            {
                System.out.println("La palabra no es palindroma");
            }
        }

        /* 
            parametros ---> aux = n (aux para guardar el numero de letras de la palabra)
                                    verificados = 0 (contador que si es igual a aux significa que de lado 
                                    a lado la palabra se lee igual)
                                    cont = 0  (contador que en la diferencia n-cont es lo que controla que
                                    bucle tenga un fin que seria el tamaño de la palabra)
                                    palabra = la palabra ingresada por el usuario
                                    n = ( numero de letras de la palabra)
        */
    
        public static boolean palindroma(int aux, int verificados, int cont, String palabra, int n)
        {
            System.out.println("1");

            if((n-cont-1) >= 0)
            {

                if (palabra.substring(cont, cont+1).equals(palabra.substring(n-1, n)))
                {
                    verificados += 2 ;
                    System.out.println(verificados);
                }

                return palindroma(aux, verificados, cont+1 ,palabra, n-1);

            }
            else if (verificados-1 == aux)
            {
                return true;
            }
            else
            {
                return false;
            }
         }

    
}



















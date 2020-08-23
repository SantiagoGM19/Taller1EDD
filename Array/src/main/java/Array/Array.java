package Array;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Array 
{
    /*
    en el método main se recogen los datos requeridos por el usuario (tamaño del array y numero).
    se hace una llamada del método HacerLista para crearla y pasarla como parámetro al método FindNumber.
    Imprime en consola si el número se encuentra en la lista o no.
    */
    public static void main(String [] args)
    {
        int a, numero, tamaño;
        boolean resultado;
        a = 1;
        Scanner read = new Scanner(System.in);
        
        System.out.println("ingrese un tamaño para el array");
        tamaño = Integer.parseInt(read.nextLine());
        
        System.out.println("Ingrese el número que quiere verificar si se encuentra en el array");
        numero = Integer.parseInt(read.nextLine()); 
        System.out.println("");
        
        int[] lista = HacerLista(tamaño);
        resultado = FindNumber(tamaño, numero, lista);

        if (resultado == true)
        {
            System.out.println("El número que ingresó se encuentra en el array");
        }
        else
        {
            System.out.println("El númeor que ingresó no se encuentra en el array");
        }
    }
    
    /*
    El método FindNumber recorre la lista por posición y retorna true o false
    dependiendo si el número ingresado por el usuario se encuentra en la lista.
    Tiene como parámetros:
    - el tamaño de la lista para poder hacer el recorrido recursivo
    - el numero ingresado por el usuario
    - la lista que se llama en el método main 
    */
    public static boolean FindNumber(int tamaño, int numero, int[] lista)
    {   
        if (tamaño > 0)
        {
            if (numero == lista[tamaño-1])
            {
                return true;
            }
            else
            {
                return FindNumber(tamaño-1, numero, lista);
            }
        }
        else
        {
            return false;
        }
        
    }
    
    /*
    Se crea un método que llena la lista con números aleatorios (enteros) en un tamaño determinado
    */
    public static int[] HacerLista(int tamaño)
    {
        int a, m, n;
        m = 10;
        n = 0;
        int[] lista = new int[tamaño];
        for (int i = 0; i < tamaño; i++ )
        {
           a = (int) Math.floor(Math.random()*m+1);
           lista[i] = a;
        }
        return lista;
    }
}

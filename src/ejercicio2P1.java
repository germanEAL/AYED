
import java.util.Scanner;

public class ejercicio2P1{

    public static int[] crearArreglo(int n) {

        int arreglo[] = new int[(n+1)];

        for(int i=1; i<=n; i++){
            arreglo[i]= i*n;
        }
        return arreglo;
    }

    public static void main(String[] args){
        System.out.println("ingrese el tamaño del arreglo ");
        Scanner S =new Scanner(System.in);
        
        int n = S.nextInt();
        System.out.println("ingrese el tamaño del arreglo ");
        int arreglo[] = crearArreglo(n);

        System.out.println("El arreglo quedo asi ");
        for (int i=1; i<=n; i++){
            System.out.println(arreglo[i]);
        }

        S.close();
        

    }
}
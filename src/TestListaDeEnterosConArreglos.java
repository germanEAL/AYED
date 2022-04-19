import java.util.Scanner;
public class TestListaDeEnterosConArreglos{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("ingresa un numero a guardar");
        int num= s.nextInt();

        ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();

        while (num != 0){
            l.agregarInicio(num);

            System.out.println("ingresa otro numero a guardar");
            num= s.nextInt();

        }

        l.comenzar();
        System.out.println("La lista quedo asi");
        while(!l.fin()){
            System.out.print(l.proximo()+" ");
        }
        s.close();
    }
}
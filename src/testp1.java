
import java.util.Scanner;

public class testp1 {
    
    public static Estudiante[] arregloEstudiante() {

        Estudiante arreglo[] = new Estudiante[2];
        Scanner S =new Scanner(System.in);
        for(int i=0; i<=1; i++){
            System.out.println("ingrese el nombre del estudiante ");
            String nombre= S.nextLine();
            System.out.println("ingrese el apellido del estudiante ");
            String apellido= S.nextLine();
            System.out.println("ingrese la comision del estudiante ");
            String comi= S.nextLine();
            System.out.println("ingrese el email del estudiante ");
            String email= S.nextLine();
            System.out.println("ingrese la direccion del estudiante ");
            String direccion= S.nextLine();

            Estudiante e = new Estudiante(nombre,apellido,comi,email,direccion);
            arreglo[i]= e;
        }

        return arreglo;
    }

    public static Profesor[] arregloProfesor() {

        Profesor arreglo[] = new Profesor[3];
        Scanner P =new Scanner(System.in);
        for(int i=0; i<=2; i++){
            System.out.println("ingrese el nombre del Profesor ");
            String nombre= P.nextLine();
            System.out.println("ingrese el apellido del Profesor ");
            String apellido= P.nextLine();
            System.out.println("ingrese el email del Profesor ");
            String email= P.nextLine();
            System.out.println("ingrese la catedra del Profesor ");
            String cate= P.nextLine();
            System.out.println("ingrese la facultad del Profesor ");
            String facultad= P.nextLine();

            Profesor p = new Profesor(nombre,apellido,email,cate,facultad);
            arreglo[i]= p;
        }
        P.close();
        return arreglo;
    }

    public static void main(String[] args){

     Estudiante arregloE[] = arregloEstudiante();
     Profesor arregloP[]= arregloProfesor();

     for(int i=0; i<=1; i++){

        System.out.print(arregloE[i].tusDatos());
     }
     for(int i=0; i<=2; i++){
        System.out.print(arregloP[i].tusDatos());

    }

}
}
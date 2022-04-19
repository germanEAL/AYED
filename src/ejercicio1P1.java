
import java.util.Scanner;

public class ejercicio1P1 {
	
	public static void conFor(int x, int y) {
		 
		 for(int i=x++;i<y;i++) {
			 System.out.println(i);
		 }

}
	public static int conWhile(int x, int y) {
		while(x <=y) {
			System.out.println(x);
			x++;
		}
		return y;
	
	}
	public static void sinEstructuras(int x, int y) {
		System.out.println(x);
		if (x < y) {
            x++;
			sinEstructuras(x,y);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		
		System.out.print("ingrese x ");
		int x=s.nextInt();
		System.out.print("ingrese y ");
		int y=c.nextInt();
		
		System.out.println("con for:");
		conFor(x,y);
		System.out.println("con while");
		conWhile(x,y);
		System.out.println("sin estructuras");
		sinEstructuras(x,y);
		
		s.close();
		c.close();
	}
	
}

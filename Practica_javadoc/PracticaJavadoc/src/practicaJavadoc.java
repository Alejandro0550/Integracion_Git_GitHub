import java.util.Scanner;

public class practicaJavadoc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el primer numero");
		int a=sc.nextInt();
		System.out.println("Dime el segundo numero");
		int b=sc.nextInt();
		
		int suma=a+b;
		int mult=a*b;
		System.out.println("Su suma es "+suma);
		System.out.println("Su multiplicacion es "+mult);
	}

}

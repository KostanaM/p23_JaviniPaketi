package kostana.maksic;

import java.util.Scanner;
import static java.lang.Math.PI;

public class Main {

	public static void main(String[] args) {

		double r,a;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Unesite poluprečnik: ");
		r=sc.nextDouble();
		
		a = PI * r * r;
		
		System.out.println("Površina kruga: " + a);
		
		sc.close();
	}

}
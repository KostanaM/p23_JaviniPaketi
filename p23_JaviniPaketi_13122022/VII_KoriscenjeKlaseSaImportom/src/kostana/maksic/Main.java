package kostana.maksic;

// 3. import with * sign

import java.util.*;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	double r, a;
	
	System.out.print("Unesite poluprecnik: ");
	
	r = sc.nextDouble();
	a = 3.14 * r * r;
	
	System.out.print("Povrsina kruga: " + a);

	sc.close();
	}

}

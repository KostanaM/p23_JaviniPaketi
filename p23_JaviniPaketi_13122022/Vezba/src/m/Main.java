package m;

public class Main {

	public static void main(String[] args) {
		K2 l []=new K2[3];
		
		l[0]= new  K2  ("Mika", 1500);
		l[1]= new  K2  ("Zika", 1500);
		l[2]= new  K2  ("Dika", -1500);
		
		for (int i=0; i<3; i++)
			l[i].Ispis();
	}

}

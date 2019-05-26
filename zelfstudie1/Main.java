package zelfstudie1;

public class Main {

	public static void main(String[] args) {
		//For loop
		for(int i=1; i<11; i++) {
			System.out.println("For loop: " + i);
		}
		
		
		//While loop
		int x = 1;
		while(x<11) {
			System.out.println("While loop: " + x);
			x++;
		}
		
		
		//Randomizer
		for(int i=1;i<11;i++) {
			double random = Math.random();
			System.out.println("Random: " + random);
		}
		
		int lijst = 0;
		//Lijst som
		for(int i=0;i<40;i++) {
			lijst = lijst + i;
		}
		System.out.println("Som van de lijst is: " + lijst);
		
		
		//Zaagtanden
		int tand = 1;
		for(int i=1;i<5;i++) {
			if(tand == 3) {
				tand = tand - 2;
			}
			//Print een 's' of 'ss' gebaseerd op hoe hoog de waarde tand is
			if(tand == 1) {
				System.out.println("s");
			} else {
				System.out.println("ss");
			}
			tand++;
		}
		
		
		

	}

}

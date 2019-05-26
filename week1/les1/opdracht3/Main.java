package week1.les1.opdracht3;

public class Main {
	public static void main(String[] arg) {
		
		//maak een student aan via de klasse Student
		Student s1 = new Student("Robert-Jan","Kroostweg 48","Zeist");
		
		//print de gegevens van een van de studenten via de toString
		System.out.println("Student 1: "+ s1.toString());
		
		Student s2 = new Student("Idsart","Bussum","Bussum");
		s2.setAdres("Bussumstraat");
		System.out.println("Student 2: "+ s2.toString());
	}
	
}

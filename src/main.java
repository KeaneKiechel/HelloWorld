public class main {

	public static void main(String[] args) {

		student st1 = new student();
		teacher t1 = new teacher();
		
		st1.name = "Al-Raffy Sarip";
		st1.idNumber = "2020-0509";
		
		t1.name = "Yassin Mohammad";
		t1.idNumber = "2020-0069";
		
		System.out.println("Student's Name: " + st1.idNumber + " " + st1.name);
		System.out.println("Teacher's Name: " + t1.idNumber + " " + t1.name);
		
	}
}


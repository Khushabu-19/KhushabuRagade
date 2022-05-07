package TypeCasting;

public class PrimitveCasting {

	public static void main(String[] args) {
		int myInt=9;
		double myDouble=myInt;
		double d =(double)myInt;
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(d);
		
		double salary=23000.235556677888976d;
		int sal=(int)salary;
		long f=(long)salary;
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("long Salary: "+f);

	}

}

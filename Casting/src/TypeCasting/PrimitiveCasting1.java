package TypeCasting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		
		int salary= 60000;
		double salaryDouble=(double)salary;
		float salaryFloat=(float)salary;
		System.out.println("*******************Explicit Widening***********************");
		System.out.println("salary"+salary+"\n salaryDouble"+salaryDouble+"\n Float salary"+salaryFloat);
		
		
		//System.out.println("*******************Implicit Widening/auto widening***********************");
		//double salaryDouble=salary;
		//float salaryFloat = salary;
		//System.out.println("salary"+salary+"\n salaryDouble"+salaryDouble+"\n Float salary"+salaryFloat);
		
		double salaryDb=30000.56d;
		// explicit narrowing 
		int salaryInt=(int)salaryDb;
		float salaryFt =(float)salaryDb;
		System.out.println("Actual Salary :"+salaryDb);
		System.out.println("Int Salary :"+salaryInt);
		System.out.println("Actual Salary :"+salaryFt);
		// Implicit narrowing not possible
	//	int salaryInt=salaryDb;

		
	}

}

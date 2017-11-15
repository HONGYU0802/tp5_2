package tp5_2;

public class Main {

	public static void main(String[] args) 
	{
		Fraction f1=new Fraction(1,2);
		Fraction f2=new Fraction(2);
		Fraction f3=new Fraction();
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		
		f2.add(f1);
		
		System.out.println(f2.toString());
		
		System.out.println(f1.comparaison(f2));
		System.out.println(f1.comparaison(f3));
		System.out.println(f1.comparaison(f1));

	}

}
package superkeyword;

public class SuperMethodC extends SuperMethodP {

	public static void main(String[] args) {
		
		SuperMethodC obj =new SuperMethodC();
		obj.name();

	}
	
	public void name()
	
	{
		super.print();
		System.out.println("Hello world");
	}
	

}

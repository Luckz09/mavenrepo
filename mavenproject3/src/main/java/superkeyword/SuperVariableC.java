package superkeyword;

public class SuperVariableC  extends SuperVariable{
	
	int b=8;
	String name="Lakshmi";

	public static void main(String[] args) {
		SuperVariableC obj=new SuperVariableC();
		obj.add();
	}
	public void add()
	{
		int sum=super.a+b;
		System.out.println(sum);
		System.out.println("Done by "+super.name);
		System.out.println(this.name);
	}

}

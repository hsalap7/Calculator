class Calculator
{
	float num1, num2;
	
	void showNumbers()
	{
		System.out.println("The first number is "+num1+" and the second number is "+num2);
	}
	void add()
	{
		float sum=num1+num2;
		System.out.println("The addition of the numbers is: "+sum);
	}
	void substract()
	{
		float minus=num1-num2;
		System.out.println("The difference between num1 and num2 is: "+minus);
	}
	void mul()
	{
		float mult=num1*num2;
		System.out.println("The product of the two numbers is: "+mult);
	}
	void div()
	{
		float divd=num1/num2;
		System.out.println("The division results in: "+divd);
	}
	void mod()
	{
		float modu=num1%num2;
		System.out.println("The modulus is: "+modu);
	}
	
	public static void main(String[] args)
	{
		Calculator c1=new Calculator(10,20);
		c1.showNumbers();
		c1.add();
		c1.substract();
		c1.mul();
		c1.div();
		c1.mod();
	}
	
	Calculator(float a, float b)
	{
		num1=a;
		num2=b;
	}
}
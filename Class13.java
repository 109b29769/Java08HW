class CCircle1{
	double pi=3.14;
	float pif=3.14f;
	double area(double r) 
	{
		return r*r*pi;
	}
	float area(float r) 
	{
		return r*r*pif;
	}
	double area(int r) 
	{
		return r*r*pi;
	}
}
public class Class13 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCircle1 obj=new CCircle1();
		System.out.println("area(2)="+obj.area(2));
		System.out.println("area(2.2f)="+obj.area(2.2f));
		System.out.println("area(2.2)="+obj.area(2.2));
	}

}

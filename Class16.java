class CSphere{
	private int x;
	private int y;
	private int z;
	private double pi=3.14;
	private int radius;
	
	void setLocation(int a,int b,int c) 
	{
		x=a;
		y=b;
		z=c;
		
	}
	void setRadius(int r) 
	{
		radius=r;
	}
	double setfaceArea() 
	{
		return 4*pi*radius*radius;
	}
	double volume() 
	{
		return 4*pi*radius*radius*radius/3;
	}
	void showCenter() 
	{
		System.out.print(x+","+y+","+z);	
	}
}
public class Class16 {

	public static void main(String[] args) 
	{
		// TODO 自動產生的方法 Stub
		CSphere cs=new CSphere();
		cs.setLocation(3,4,5);
		cs.setRadius(1);
		cs.showCenter();
		
	}

}

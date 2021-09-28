
class CBox{
	int length;
	int width;
	int height;
	
	int volume() //B
	{
		return length*width*height;
	}
	
	int surfaceArea() //C
	{
		return 2*(length*width+width*height+height*length);
	}
	
	void showData() //D
	{
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
	}
	void showAll() //D
	{
		System.out.println(surfaceArea());
		System.out.println(volume());

	}
}

public class Class05 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CBox box;
		box= new CBox();
		box.length=1;
		box.width=1;
		box.height=1;
		box.showAll();
		
	}

}

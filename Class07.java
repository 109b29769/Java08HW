import java.util.*;
class CTest{
	void test(int n) {
		if (n==0)
		{
			System.out.println("计 0");
		}
		else 
		{
			if(n%2==1) 
			{
				System.out.println("计计");	
			}
			else 
			{
				System.out.println("计案计");
			}
		}
}
}
		
public class Class07 {

	public static void main(String[] args) {
		// TODO 笆玻ネよ猭 Stub

		CTest t=new CTest();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		t.test(n);
	}

}

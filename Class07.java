import java.util.*;
class CTest{
	void test(int n) {
		if (n==0)
		{
			System.out.println("���Ƭ� 0");
		}
		else 
		{
			if(n%2==1) 
			{
				System.out.println("���Ƭ��_��");	
			}
			else 
			{
				System.out.println("���Ƭ�����");
			}
		}
}
}
		
public class Class07 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub

		CTest t=new CTest();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		t.test(n);
	}

}

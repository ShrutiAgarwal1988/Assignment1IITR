import java.util.Scanner;
public class ConicalStarPattern2 {
ConicalStarPattern2(int limit)

{
	for(int i=0;i<limit;i++)
	{
		for(int j=limit-i;j>1;j--)
		{
			System.out.print(" ");
		}
	for (int k=0;k<=i;k++)
	{
		System.out.print(" "+"*"+" ");
	}
	System.out.println();
		}
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter the limit");
int limit=sc.nextInt();
new ConicalStarPattern2(limit);

	}

}

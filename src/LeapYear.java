import java.util.Scanner;
public class LeapYear {
//using static method
	
	static void isLeapYear(int year)
	{
		if (year%400==0)
		{
			System.out.println("It is a leap year");
		
		}
		else if(year%100==0)
		{
			System.out.println("not a leap year");
		}
		else if(year%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int year=sc.nextInt();
isLeapYear(year);
	}

}

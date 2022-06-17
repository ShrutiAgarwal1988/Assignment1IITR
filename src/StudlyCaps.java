import java.util.Scanner;
public class StudlyCaps {
public void asciivalues1()
{
	int ascii_a='a';
	int ascii_z='z';
	int ascii_0='0';
	int ascii_9='9';
	System.out.print("values are"+ascii_a+" "+ascii_z+" "+ascii_0+" "+ascii_9+" ");
}

public void asciivalues2()
{
	int ascii_A='A';
	int ascii_Z='Z';
	System.out.println("Ascii values for A"+ascii_A+"Ascii value for Z"+ascii_Z);
}
public void convert(String str)
{
	String text="";
	
	for(int i=0;i<str.length();i++)
	{
		int ascii=str.charAt(i);
		
			
		if(ascii>=97 && ascii<=122)
		{
			ascii=ascii-32;
			 text+=(char)ascii;
		}
	
		else if(ascii>=65 && ascii<=90) {
		 
	 
			ascii=ascii+32;
			text+=(char)ascii;
		}
		else if(ascii>=48 && ascii<=57)
			
		{
			 text+=(int)ascii;
		}
	
		
	}
	System.out.print("Converted text is:"+text);
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str;
System.out.println("Enter the string");
str=sc.nextLine();
StudlyCaps obj=new StudlyCaps();
obj.asciivalues1();
obj.asciivalues2();
obj.convert(str);

	}

}

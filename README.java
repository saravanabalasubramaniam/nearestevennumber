import java.io.*;
import java.util.*;
class Nearestevennumber
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	if(a%2==0)
	{
		System.out.println(a);
	}	
	else
	{	
		a++;
		System.out.println(a);
	}

  }
}

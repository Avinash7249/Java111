package Question1;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Demo {
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Parragraph");
	    String str = sc.nextLine();
	     String str1=str.toLowerCase();
	    int count = 0;
	    Pattern p = Pattern.compile("java");
	    Matcher m = p.matcher(str1);
	    while (m.find()) {
	    count++;
	    System.out.println(m.start() + "------" + m.end() + "------" + m.group());
	    }
	    System.out.println("The no of occurences:" + count);
	    }
	    
	}
	


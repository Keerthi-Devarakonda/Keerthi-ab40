package stringfunctions;

import java.util.*;

public class epochtime 
{

	public static void main(String[] args)
	{
		
		Date d1 = new Date();
 d1.getTime();
System.out.println(d1.getTime());
Date d2 = new Date(d1.getTime());
System.out.println(d2);

String currenttime =d2.toString();
String futuretime =((currenttime)+(1000*60*60*24*1));
System.out.println(futuretime);
System.out.println(currenttime);

Date d3 = new Date(d1.getTime()+(1000*60*60*24*1));
System.out.println(d3);

String month =currenttime.substring(4,7);
System.out.println(month);

String date =currenttime.substring(8,10);
System.out.println(date);

currenttime.length();
String year= currenttime.substring(currenttime.length()-4);
System.out.println(year); 

System.out.println(month.concat(date).concat(year));

System.out.println(month.concat (" ").concat(date).concat (" ").concat(year));

System.out.println(date.concat (" ").concat(month).concat (" ").concat(year));

String myname = "I am a Mom";
System.out.println(myname.trim());


String myname2 = "  I am  a   Mom ";
System.out.println(myname2.trim());









	}

}

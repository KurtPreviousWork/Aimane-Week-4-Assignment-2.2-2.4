
import java.util. *;
public class Mainn {
	
	   public static void main (String [] args) {
	       Scanner keyboard = new Scanner (System.in);

	       System.out.print("Enter your birth year (4-Digit):");
	       int birth_Year = keyboard.nextInt();
	       System.out.print("Enter your birth day (Number):");
	       int birth_Day = keyboard.nextInt();
	       System.out.print("Enter your birth month (number):");
	       int birth_Month = keyboard.nextInt();
	       
	       
	       String bDay = "Your birthday is on day";
	       String doy = " of the year!";
	       
	       Month m = new Month();
	       
	       
	switch (birth_Month) 
	{
	case 1: 
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day ) + "%s", bDay, doy);
	       break;
	case 2: 
		m.setMonth(31);
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day ) + "%s", bDay, doy);
	       break;
	case 3: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(60);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(59);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day ) + "%s", bDay, doy);
	       break;
	case 4: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(91);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(90);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day ) + "%s", bDay, doy);
	       break;
	case 5: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(121);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(120);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day ) + "%s", bDay, doy);
	       break;
	case 6: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(152);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(151);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day ) + "%s", bDay, doy);
	       break;
	case 7: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(182);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(181);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day) + "%s", bDay, doy);
	       break;
	case 8: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(213);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(212);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day) + "%s", bDay, doy);
	       break;
	case 9: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(244);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(243);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day) + "%s", bDay, doy);
	       break;
	case 10: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(274);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(273);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day) + "%s", bDay, doy);
	       break;
	case 11: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(305);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(304);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day) + "%s", bDay, doy);
	       break;
	case 12: 
		if(birth_Year%400==0||birth_Year%4==0) 
		{
			System.out.println("This is a leap year!");
			m.setMonth(335);
		}
		else
		{
			System.out.println("This is not a leap year!");
			m.setMonth(334);
		}
	           System.out.printf("%s\n" + (m.getMonth() + birth_Day) + "%s", bDay, doy);
	       break;
	default:
	           System.out.println ("Wrong date entered.");
	       break;

	       }
			keyboard.close ();
	   }
}


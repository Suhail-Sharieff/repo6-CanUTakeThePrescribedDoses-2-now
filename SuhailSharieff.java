import java.util.Scanner;

// This code provided is a Java program that takes input from the user and checks whether the input value falls within a certain range. The program then outputs a message based on the input value. This program can be used by patients to manage their tablet taking time by setting the values of d, l, and r to the appropriate values.

// For example, let’s assume that a patient needs to take a tablet every 8 hours. The patient can set the value of l to 0 and the value of r to 8. The patient can then set the value of d to the number of hours since the last tablet was taken. If the output message is “correct time”, the patient can take the tablet. If the output message is “too late”, the patient has missed the tablet and should take it as soon as possible. If the output message is “too early”, the patient should wait until the appropriate time to take the tablet.

// It is important to note that this program is just an example and should not be used as a substitute for medical advice. Patients should always consult with their healthcare provider before making any changes to their medication regimen.
public class SuhailSharieff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			System.out.println("enter the number of days before which you have taken the first dose: ");
			int d=sc.nextInt();
			System.out.println("enter the minimum number of days doctor said to give break after conduming first dose: ");
			int l=sc.nextInt();
			System.out.println("enter max number of days under which u had to take both doses: ");
			int r=sc.nextInt();
			if((d>=l)&&(d<=r)){
				System.out.println("correct time to take second dose now ");

			}
			else if((d>r)&&(d>=l)){
				System.out.println("too late to take second dose");
			}
			else{
				System.out.println("too early to take second dose");
			}
		

	}
}
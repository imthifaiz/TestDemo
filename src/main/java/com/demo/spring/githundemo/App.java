import java.util.Scanner;

public class Sample {
	public static void main(String args[]) {
		String[] Dept = {"CSE", "ECE", "CIVIL", "MECH"};
		for (String k : Dept)
		{
			System.out.println("\n			<<--------"+k+" DEPARTMENT-------->>");
			for (int i=1; i<=1; i++)
			{
			System.out.println("___________________________________class "+i+" "+k+"___________________________________");
				for (int j=1; j<=2; j++)
				{
				System.out.println("\n**********STUDENT "+j+"**********");
				Scanner input = new Scanner(System.in);
				System.out.print("Enter Name: ");
				String name = input.nextLine();
				System.out.print("Enter Roll Number: ");
				String roll = input.nextLine();
				System.out.println("STUDENT NAME IS : "+name + " ||ROLL NUMBER IS : "+roll);
				}
				System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________");
			}
		}
	}
}

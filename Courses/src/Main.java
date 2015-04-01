import java.util.Scanner;
public class Main
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner (System.in);
		System.out.println(" Select the course that you would like to take ");
		System.out.println(" and in return we'll give away the "
				+ "\n title, number, description, and department that teaches the course ");
		System.out.println(" Which types of courses would you like to take? (math or science)");
		String mathCourses= input.nextLine();
		if (mathCourses.contains("math"))
		{//the selected course will take user to the subclass of the same name
			//and the class will give you 3 options for a professor for the user to choose
			System.out.println("which math course?(calculus1, calculus 2, statistics)");
			String math= input.nextLine(); 
			if (math.contains("calculus 1"))
			{
				Calculus math1= new Calculus();
				 math1.MathOptions();
				System.out.println(math1.getFullDescription());
			}
			else if(mathCourses.contains("calculus 2"))
			{
				Calculus2 math1= new Calculus2();
				math1.calc2Options();
				System.out.println(math1.getFullDescription());
			}
			else 
			{
				Statistics math1= new Statistics();
				math1.calc2Options();
				System.out.println(math1.getFullDescription());
			}
			
		}
		else 
		{
			System.out.println("which science course? (biology, or chemistry)");
			String scienceCourses= input.nextLine();
			if (scienceCourses.contains("biology"))
			{
				biology bio = new biology();
				bio.biologyOptions();
				System.out.println(bio.getFullDescription());
			}
			else 
			{
				chemistry chem= new chemistry();
				chem.chemistryOptions();
				System.out.println(chem.getFullDescription());
			}
			
		}

	}

}

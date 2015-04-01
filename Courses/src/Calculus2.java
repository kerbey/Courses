
public class Calculus2 extends course
{
	public Calculus2()
	{
		super();
	}
	public String calc2Options()
	{//title, number, description, and department that teaches the course
		System.out.println("which professor? (John, Henry, Jack)");
		String math= input.nextLine(); 
		if (math.contains("John"))
		{
			setProffessor("John");
			setTitle("Calculus 2");
			setDepartment("Mathematics department");
			setClassNumber("132-23");
			setDescription(" This course is to be taken after calc 1. There will be"
					+ " more integral based problems.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else if(math.contains("Henry"))
		{
			setProffessor("Henry");
			setTitle("Calculus 2");
			setDepartment("Mathematics department");
			setClassNumber("132-23");
			setDescription(" This course is to be taken after calc 1. There will be"
					+ " more integral based problems.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else 
		{
			setProffessor("Jack");
			setTitle("Calculus 2");
			setDepartment("Mathematics department");
			setClassNumber("132-23");
			setDescription(" This course is a calc 1 requisite. There will be"
					+ " more integral involved problems.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
	}
}

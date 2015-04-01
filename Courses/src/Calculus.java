public class Calculus extends course
{
	public Calculus()
	{
		super();
	}
	public String MathOptions()
	{//title, number, description, and department that teaches the course
		System.out.println("which professor? (Steve, Jeff, Bill)");
		String math= input.nextLine(); 
		if (math.contains("Steve"))
		{
			setProffessor("Steve");
			setTitle("Calculus 1");
			setDepartment("Mathematics department");
			setClassNumber("112-23");
			setDescription(" This course involves limits and the differentiation and integration of functions"
					+ "\n with different variables.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else if(math.contains("Jeff"))
		{
			setProffessor("Jeff");
			setTitle("Calculus 1");
			setDepartment("Mathematics department");
			setClassNumber("114-22");
			setDescription(" This course involves limits and the differentiation and integration of functions"
					+ "\n with different variables.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else 
		{
			setProffessor("Steve");
			setTitle("Calculus 1");
			setDepartment("Mathematics department");
			setClassNumber("119-33");
			setDescription(" This course involves limits and the differentiation and integration of functions"
					+ "\n with different variables.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
	}
}
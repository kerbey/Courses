
public class biology extends course
{
	public biology()
	{
		super();
	}
	public String biologyOptions()
	{//title, number, description, and department that teaches the course
		System.out.println("which professor? (Lee, Persaud, Micheal)");
		String biology= input.nextLine(); 
		if (biology.contains("Lee"))
		{
			setProffessor("Lee");
			setTitle("biology");
			setDepartment("Science department");
			setClassNumber("150-22");
			setDescription(" This course is dedicated to studying plant and animal life.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else if(biology.contains("Persuad"))
		{
			setProffessor("Persuad");
			setTitle("biology");
			setDepartment("Science department");
			setClassNumber("153-19");
			setDescription(" This course is dedicated to studying plant and animal life.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else 
		{
			setProffessor("Micheal");
			setTitle("biology");
			setDepartment("Science department");
			setClassNumber("151-01");
			setDescription(" This course is dedicated to studying plant and animal life.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
	}
}

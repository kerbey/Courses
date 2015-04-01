
public class chemistry extends course
{
	public chemistry()
	{
		super();
	}
	public String chemistryOptions()
	{//title, number, description, and department that teaches the course
		System.out.println("which professor? (Jacob, Jonathan, James)");
		String biology= input.nextLine(); 
		if (biology.contains("Jacob"))
		{
			setProffessor("Jacob");
			setTitle("chemistry");
			setDepartment("Science department");
			setClassNumber("160-02");
			setDescription(" This course is dedicated to studying of the periodic"
					+ " tables elements along with different chemicals and their reactions when mixed.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else if(biology.contains("Jonathan"))
		{
			setProffessor("Jonathan");
			setTitle("chemistry");
			setDepartment("Science department");
			setClassNumber("161-03");
			setDescription(" This course is dedicated to studying of the periodic"
					+ " tables elements along with different chemicals and their reactions when mixed.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else 
		{
			setProffessor("James");
			setTitle("chemistry");
			setDepartment("Science department");
			setClassNumber("162-01");
			setDescription(" This course is dedicated to studying of the periodic tables elements"
					+ " along with different chemicals and their reactions when mixed.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
	}
}

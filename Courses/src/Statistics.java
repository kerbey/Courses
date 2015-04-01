
public class Statistics extends course
{
	public Statistics()
	{
		super();
	}
	public String calc2Options()
	{
		System.out.println("which professor? (Martin, Robert, Jose)");
		String math= input.nextLine(); 
		if (math.contains("Martin"))
		{
			setProffessor("Martin");
			setTitle("Statistics");
			setDepartment("Mathematics department");
			setClassNumber("134-22");
			setDescription(" This course is all about collecting and interpretation"
					+ " of data.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else if(math.contains("Robert"))
		{
			setProffessor("Robert");
			setTitle("Statistics");
			setDepartment("Mathematics department");
			setClassNumber("143-19");
			setDescription(" This course is all about collecting and interpretation"
					+ " of data.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
		else 
		{
			setProffessor("Jose");
			setTitle("Statistics");
			setDepartment("Mathematics department");
			setClassNumber("233-01");
			setDescription(" This course is all about collecting and interpretation"
					+ " of data.");
			String fullDescription=("You have proffessor "+getProffessor()+"'s "+getTitle()+" class; class number:"+getClassNumber()+
					";\n Taught by the "+getDepartment()+"\n"+getDescription());
			setFullDescription(fullDescription);
			return getFullDescription();
		}
	}
}

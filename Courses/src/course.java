import java.util.Scanner;
public class course
{// super class which comes with the description, department, Title, fullDescription, classNumber, proffessor
// 
	Scanner input= new Scanner (System.in);
	private String  description, department, Title, fullDescription, classNumber, proffessor;
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getClassNumber()
	{
		return classNumber;
	}
	public void setClassNumber(String classNumber)
	{
		this.classNumber = classNumber;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String title)
	{
		Title = title;
	}
	public String getFullDescription()
	{
		return fullDescription;
	}
	public void setFullDescription(String fullDescription)
	{
		this.fullDescription = fullDescription;
	}
	public String getProffessor()
	{
		return proffessor;
	}
	public void setProffessor(String proffessor)
	{
		this.proffessor = proffessor;
	}
}

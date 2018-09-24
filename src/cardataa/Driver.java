package cardataa;


public class Driver {
	private int id;
	private String name;
	public void setid(int id)
	{
		this.id=id;
		
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String setname()
	{
		return name;
	}
	public void printDriver()
	{
		System.out.println("driver Id number :" +id);
		System.out.println("driver name :" +name);
		}
	
}

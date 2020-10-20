public class Vehicle
{
	private String regNo;
	private String owner;

	Vehicle()
	{
		regNo = "";
		owner = "";
	}

	public Vehicle(String regNo, String owner)
	{
		this.regNo = regNo;
		this.owner = owner;
	}

	//setter
	public void setOwner(String owner)
	{
		this.owner = owner;
	}

	public void setRegNo(String regNo)
	{
		this.regNo = regNo;
	}

	//getter
	public String getOwner()
	{
		return this.owner;
	}

	public String getRegNo()
	{
		return this.regNo;
	}

	public String toString()
	{
		return getRegNo()+" owned by "+getOwner();
	}
}

public class Bus extends Vehicle
{
	private int sittingCapacity;
	private int standingCapacity;

	Bus()
	{
		this.sittingCapacity = 0;
		this.standingCapacity = 0;
	}

	public Bus(String regNo, String owner, int sittingCapacity, int standingCapacity)
	{
		super(regNo, owner);
		this.sittingCapacity = sittingCapacity;
		this.standingCapacity = standingCapacity;
	}

	//setter
	public void setSittingCapacity(int sittingCapacity)
	{
		this.sittingCapacity = sittingCapacity;
	}

	public void setStandingCapacity(int standingCapacity)
	{
		this.standingCapacity = standingCapacity;
	}

	//getter
	public int getSittingCapacity()
	{
		return this.sittingCapacity;
	}

	public int getStandingCapacity()
	{
		return this.standingCapacity;
	}

	public String toString()
	{
		return "Bus "+super.toString()+" with sitting capacity: "+getSittingCapacity()+" and standing capacity: "+getStandingCapacity();
	}
}

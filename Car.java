public class Car extends Vehicle
{
	private int seatCapacity;

	//constructor kosong
	public Car()
	{
		this.seatCapacity = 0;
	}

	//constructor
	public Car(String regNo, String owner, int seatCapacity)
	{
		super(regNo, owner);
		this.seatCapacity = seatCapacity;
	}

	//setter
	public void setSeatCapacity(int seatCapacity)
	{
		this.seatCapacity = seatCapacity;
	}

	//getter
	public int getSeatCapacity()
	{
		return this.seatCapacity;
	}

	//toString()
	public String toString()
	{
		return "Car "+super.toString()+" with seat capacity "+getSeatCapacity();
	}
}



package cardataa;

public class Car {
	private static String manufacture="maruthi motors";
	private int carObjectCount;
	private String carNumber;
	private int carFuelCapacity;
	private int carMaxSpeedLimit;
	private int runningSpeed;
	private int fuelInTank;
	private boolean headLights;
	private Driver drives;
	private String destination;
	private String from;
	private String startingTime;

	public void fillFuel(int fuel)
	{
		if(fuelInTank < carFuelCapacity)
		{
			fuelInTank=carFuelCapacity+fuel;
		}
		if(fuelInTank == carFuelCapacity)
		{
			System.out.println("tank is full");
		}
		else
		{
			System.out.println("not full");
		}
	}
	public void accelator(int speed)
	{
		if(runningSpeed< carMaxSpeedLimit)
		{
			System.out.println(runningSpeed);
			System.out.println(carMaxSpeedLimit);
			fuelInTank--;
		}
		if(runningSpeed>carMaxSpeedLimit)
		{
			System.out.println("carmaxspeed extends");
			
		}
		else
		{
			System.out.println("not extends");
		}
	}
	public void isHeadLight()
	{
		
		if(headLights==true)
		{
			System.out.println("car lights is on");
		}
		else
		{
			System.out.println("car light is off");
		}
	}
	public void setcarObjectCount(int  carObjectCount)
	{
		this. carObjectCount= carObjectCount;
	}
	public int getcarObjectCount()
	{
		return  carObjectCount;
	}
	public void setcarNumber(String carNumber)
	{
		this.carNumber=carNumber;
	}
	public String getcarNumber()
	{
		return carNumber;
	}
	public void setcarFuelCapacity(int carFuelCapacity)
	{
		this.carFuelCapacity=carFuelCapacity;
	}
	public int getcarFuelCapacity()
	{
		return carFuelCapacity;
	}
	public void setcarMaxSpeedLimit(int carMaxSpeedLimit)
	{
		this.carMaxSpeedLimit=carMaxSpeedLimit;
	}
	public int getcarMaxSpeedLimit()
	{
		return carMaxSpeedLimit;
	}
	public void setrunningSpeed(int runningSpeed)
	{
		this.runningSpeed=runningSpeed;
	}
	public int getrunningSpeed()
	{
		return runningSpeed;
	}
	public void setfuelInTank(int fuelInTank)
	{
		this.fuelInTank=fuelInTank;
	}
	public int getfuelInTank()
	{
		return fuelInTank;
	}
	public void setheadLights(boolean headLights)
	{
		this.headLights=headLights;
	}
	public boolean getheadLights()
	{
		return headLights;
	}
	public void setdrives(Driver drives)
	{
		this.drives=drives;
	}
	public Driver getdrives()
	{
		return drives;
	}
	public void setdestination(String destination)
	{
		this.destination=destination;
	}
	public String getdestination()
	{
		return destination;
	}
	public void setfrom(String from)
	{
		this.from=from;
	}
	public String getfrom()
	{
		return from;
	}
	public void setstartingTime(String startingTime)
	{
		this.startingTime=startingTime;
		
	}
	public String getstartingTime()
	{
		return startingTime;
	}
	public void isPrintCarData()
	{
		System.out.println("CAR OBJECTCOUNT :" +carObjectCount);
		System.out.println("CAR NUMBER : "+carNumber);
		System.out.println("CAR FUELCAPACITY : "+ carFuelCapacity);
		System.out.println("CAR MAX SPEED LIMITT : "+carMaxSpeedLimit);
		System.out.println("RUNNING SPEED : "+runningSpeed);
		System.out.println("FUEL TANK : "+fuelInTank);
		System.out.println("HEAD LIGHTS : "+headLights);
		System.out.println("DESTINATION : "+destination);
		System.out.println("FROM : "+from);
		System.out.println("STARTING TIME : "+startingTime);
	}
}

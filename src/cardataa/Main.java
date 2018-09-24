package cardataa;

public class Main {


	public static void main(String[] args) {
		Car c1=new Car();
		Driver d1=new Driver();
		c1.setdrives(d1);
		
		d1.setid(111);
		d1.setname("akash");
		
		c1.setcarObjectCount(9);
		c1.setcarNumber("AP23223Q");
		c1.setcarFuelCapacity(100);
		c1.setcarMaxSpeedLimit(120);
		c1.setrunningSpeed(60);
		c1.setfuelInTank(90);
		c1.setheadLights(true);
		c1.setdestination("Hyderabad");
		c1.setfrom("Nizamabad");
		c1.setstartingTime("12 clock");
	
		Car c2=new Car();
		
		Driver d2=new Driver();
		c2.setdrives(d2);
		
		d2.setid(222);
		d2.setname("anil");
		
		c2.setcarObjectCount(8);
		c2.setcarNumber("AP23233E");
		c2.setcarFuelCapacity(80);
		c2.setcarMaxSpeedLimit(100);
		c2.setfuelInTank(80);
		c2.setrunningSpeed(90);
		c2.setheadLights(false);
		c2.setdestination("kadapa");
		c2.setfrom("karimnagar");
		c2.setstartingTime("10 clock");
		
		Car c3=new Car();
		
		c3.setcarObjectCount(8);
		c3.setcarNumber("AP21233F");
		c3.setcarFuelCapacity(90);
		c3.setcarMaxSpeedLimit(110);
		c3.setfuelInTank(30);
		c3.setheadLights(false);
		c3.setrunningSpeed(120);
		c3.setdestination("Prakasham");
		c3.setfrom("Nizamabad");
		c3.setstartingTime("5 clock");
		
		Driver d3=new Driver();
		c3.setdrives(d3);
		d3.setid(333);
		d3.setname("avan");

//car1 data
		System.out.println("\\**CAR 1 DETAILS***\\");
		c1.fillFuel(5);
		
		c1.accelator(10);
		
		c1.isHeadLight();
		d1.printDriver();
		c1.isPrintCarData();
		System.out.println();
		System.out.println();
//car2 details	
		System.out.println("//**CAR 2DETAILS**//");
        c2.fillFuel(5);
		c2.accelator(10);
		c2.isHeadLight();
		System.out.println();
		
		d2.printDriver();
		c2.isPrintCarData();
		System.out.println();
	//car3 details	
		System.out.println("//**CAR 3 DETAILS**//");
        c3.fillFuel(5);
		c3.accelator(10);
		c3.isHeadLight();
		System.out.println();

		d3.printDriver();
		c3.isPrintCarData();
		System.out.println();
		  
		Car[] t=new Car[3];
		t[0]=c1;
		t[1]=c2;
		t[2]=c3;
		
		Main m=new Main();
		m.findCars(t,"nizamabad");
	}
public static Car[] findCars(Car[] t,String destination)
{
	int c=0;
	String s="";
	for(int i=0;i<t.length;i++)
	{
		if(t[i].getfrom()=="Nizamabad" && t[i].getdestination()=="Prakasham")
		{
			s=t[i].getstartingTime()+" "+t[i].getcarNumber()+"";
			c++;
		}
		
	}
	if(c>=1)
	{
		System.out.println("cars avaliable:" +c);
	}
	else
	{
		System.out.println("no cars avalable");
	}
	return t;
}

}

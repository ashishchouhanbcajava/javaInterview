package loose.Coupling;

class PetrolEngine implements Engine
{

	@Override
	public void Starts() {
		System.out.println("petrolEngine is starting......");
		
	}
	
}
class DieselEngine implements Engine{

	@Override
	public void Starts() {
		System.out.println("DieselEngine is starting......");
		
	}
	
}
class ElectricEngine implements Engine
{

	@Override
	public void Starts() {
		System.out.println("ElectricEngine is starting......");
		
	}
	
}

public class Car {
//	Engine engine;
//	Car(Engine engine)
//	{
//		this.engine=engine;
//	}
//	 public void startCar()
//	 {
//		 engine.Starts();
//	 }
	public static void main(String[] args) {
		
//		PetrolEngine petrolEngine = new PetrolEngine();
//		Car car = new Car(petrolEngine);
//		car.startCar();
//		
		Engine engine=new PetrolEngine();
		engine.Starts();
	}

}

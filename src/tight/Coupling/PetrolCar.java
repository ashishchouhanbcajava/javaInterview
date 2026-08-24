package tight.Coupling;

public class PetrolCar {

	Engine engine = new Engine();

	public void startCar() {
		engine.starts();// at here petrol class is totally dependent in the engine class starts method
						// it is called loose coupling when if we want to change the Engine class to
						// Electric engine then we also have to change in the car class 

	}

	public static void main(String[] args) {
		PetrolCar car = new PetrolCar();
		car.startCar();
	}

}

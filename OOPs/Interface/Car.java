package OOPs.Interface;

public class Car implements Engine,Break {

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Car breaked");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(" Car started");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Car moved");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("car stopped");
	}

}

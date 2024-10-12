abstract class Bike {
	abstract void run();
}

class Honda  extends Bike{
	public void run()
	{
		System.out.println("Honda Bike is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		      h.run();

	}
  }


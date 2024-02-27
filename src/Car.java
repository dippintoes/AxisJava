
class Vehicle {
		void drive() {
			System.out.println("Driving a vehicle."); 
			}
	}

class Car extends Vehicle {
		void drive()
		{
			System.out.println("Repairing a car");
		}
	

		public static void main(String[] args)
		{
			Vehicle obj2 = new Car();
			obj2.drive();
		}
	
}



package week1.day1;

public class Car {
	
	public void applybreak(int gear) {
	
	System.out.println("applybreak"+ gear);
	}
	public void soundhorn(String loud) {
		
		System.out.println("loud"+ loud);
	}
	
	public static void main(String[] args) {
		Car kia=new Car();
		kia.applybreak(5);
        kia.soundhorn(null);
	}

}

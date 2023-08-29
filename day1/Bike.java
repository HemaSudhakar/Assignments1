package week1.day1;

public class Bike {
	
	public void applybreak(int gear) {
		
		System.out.println("applybreak"+ gear);
		}
		public void soundhorn(String loud) {
			
			System.out.println("loud"+ loud);
			System.out.println("loud"+ loud);
		}
		
		public static void main(String[] args) {
			Bike fz=new Bike();
			fz.applybreak(5);
	        fz.soundhorn(null);
		}

	}


	


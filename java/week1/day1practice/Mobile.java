package week1.day1practice;

public class Mobile {
	
	public void makecall(){
		String type ="Samsung";
		float weight=420.3f;
		System.out.println("this is my moible" +type);
	}
public void sendmsg() {
	boolean visible=true;
	int pay=500;
	System.out.println("sendmsg" +pay);
}
	public static void main(String[] args) {
		
Mobile sums=new Mobile();
sums.makecall();
sums.sendmsg();


	}

}


public class Primeno {

	public static void main(String[] args) {
		int input =13;
		boolean flag =false;
		for(int i=2;i<=input/2;i++) {
			if(input%2==0) {
			flag=true;
			break;
			}
		}
			if(!flag) 
				System.out.println(input +"is a prime no");
			else
				System.out.println(input +"is not a prime no");
			}
		
		}	
	


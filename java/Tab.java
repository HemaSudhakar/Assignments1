
public class Tab {
	

	public int tabprice() {
		int tabprice=10000;
		return tabprice;
		
		
		
	}
	public String tabbrand(String brandname) {
		brandname ="apple";
		return brandname;
		
	}
	public static void main(String[] args) {
		Tab my=new Tab();
		my.tabprice();
		
		//System.out.println(my.tabprice());
		String own=my.tabbrand(null);
		System.out.println(own);
	}
}
   





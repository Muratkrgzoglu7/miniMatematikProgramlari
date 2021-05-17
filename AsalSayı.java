package replay;

public class AsalSayý {

	public static void main(String[] args) {
	int number=30;
	boolean isPrime=true;
	for(int i=2;i<number;i++) {
		if(number%i==0) {
			isPrime=false;
		}
	}if(number==1) {
		System.out.println("Bu bir asal sayý deðildir");
		return;
	}
	
	
	if(number<2) {
		System.out.println("Geçersiz sayý girdiniz");
	}
	
	if(isPrime==true) {
		System.out.print("Bu bir asal sayýdýr ");
	}else {
		System.out.print("Bu bir asal sayý deðildir ");
	}
		
	}

}

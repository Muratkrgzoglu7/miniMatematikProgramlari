package replay;

public class AsalSay� {

	public static void main(String[] args) {
	int number=30;
	boolean isPrime=true;
	for(int i=2;i<number;i++) {
		if(number%i==0) {
			isPrime=false;
		}
	}if(number==1) {
		System.out.println("Bu bir asal say� de�ildir");
		return;
	}
	
	
	if(number<2) {
		System.out.println("Ge�ersiz say� girdiniz");
	}
	
	if(isPrime==true) {
		System.out.print("Bu bir asal say�d�r ");
	}else {
		System.out.print("Bu bir asal say� de�ildir ");
	}
		
	}

}

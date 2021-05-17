
public class Mukemmelsayi {

	public static void main(String[] args) {
		// 1+2+3=6    1+2+4+7+14=28
		
		int number=6;
		int total=0;
		for(int i=1;i<number;i++) {
			if(number%i==0)
			total=total+i; 
		}if(total==number) {
			System.out.println("Bu sayý bir Mükemmel sayýdýr");
		}else {
			System.out.println("Bu sayý bir Mükemmel sayý deðildir");
			
		}

	}

}

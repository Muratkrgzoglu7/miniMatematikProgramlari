package replay;

public class Switch {

	public static void main(String[] args) {
		char grade='B';
		switch(grade) {
		case 'A':
		System.out.println("Mükemmel : Geçtiniz");
		break;
		case 'B':
			System.out.println("Çok iyi : Geçtiniz");
			break;
		case 'C':
		System.out.println("Fena deðil : Geçtiniz");
		break;
		case 'F':
		System.out.println("Malesef : Kaldýnýz");
		break;
		default:
			System.out.println("Geçersiz not girdiniz");
		
		}

	}

}

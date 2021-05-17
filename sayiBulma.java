
public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar= {1,2,2,3,4,5,6,7,};
		int aranacakSayi=2;
		boolean varMi=false;
		for(int sayi : sayilar) {
			if(sayi==aranacakSayi) {
				varMi=true;
			
			}
		}if(varMi) {
			System.out.println("Aranacak sayý bulundu");
		}else {
			System.out.println("Aranacak sayý bulunamadý");
		}

	}

}

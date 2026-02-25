package hafta_2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 10, b=3,c;
		double x=10,y=3,z;
		c=a/b;
		z=x/y;
		if(z==y) System.out.println("Sayilar esit");
		else System.out.println("Sayilar esit degil");
		
		long sayi=300_000_000_000L; // L ile sayiyi long olarak degerlendirir. yazmazsak int degerlendirir yani int olmaya calisir ev int boyutlarini asarsa hata verir.
		//float tur=0.1; // Hata! Nasıl ki tam sayılar otomatik int sayılıyorsa, Java'da noktalı/virgüllü bir sayı (örneğin 0.1) yazdığın an bilgisayar bunu otomatik olarak en geniş kutu olan double (64-bit) kabul eder.
		// sebep: 64 bitlik double sayisini 32 bitlik floata sokmaya calisiyoruz..java veri kaybi konusunda katidir.
		float tur2=(float)0.1; // zorla floata sigdirdik.
		float tur3=0.3F; // en iyi yontem. java bastan itibaren Float algilar.
		
		
		
		
		
		
		
		
			
		
		
		
	}

}

import java.util.ArrayList;
import java.util.Random;

public class Runner {
	
	public static void arrayYazdir(ArrayList<Integer> arr) {
		for (Integer eleman : arr) {
			System.out.println(eleman);
		}
	}
	
	public static void main(String[] args) {
		int []dizi= {3,4,5};
		
		//ArrayList olusturma
		ArrayList<String> arabalar=new ArrayList<String>();
		
		//ArrayListe eleman ekleme
		arabalar.add("Volvo");
		arabalar.add("BMW");
		arabalar.add("Ford");
		
		//Elemanlari gormel:
		System.out.println(arabalar);
		
		//for ile elemanlari gosterme: //arraylist size ile gosterilir
		for (int i = 0; i < arabalar.size(); i++) {
			System.out.println(i+". eleman"+arabalar.get(i)); //elemanlari gosterir get.
		}
		//Araya eleman ekleme
		arabalar.add(1, "Tesla");
		//foreach;
		int sayac=0;
		for (String araba : arabalar) {
			System.out.println(sayac++ +araba);
		}
		ArrayList<Integer> sayilar=new ArrayList<>(); //boyle bos da gosterebilirsin.
		
		System.out.println(sayilar.size());//default olarak 0 alir
		Random random = new Random();
		for (int i = 0; i < 5; i++) {	
			int sayi = random.nextInt(0, 101);
			sayilar.add(sayi);//sayiyi eklyiorsun
		}
		
		arrayYazdir(sayilar);
		System.out.println("Eleman sayisi " +sayilar.size());
		
		System.out.println("===================================");
		
		Kisi k1=new Kisi("Ece", "Naz");
		Kisi k2=new Kisi("Su","Naz");
		Kisi k3=new Kisi("Ali", "Eke");
		
		ArrayList<Kisi> kisiler=new ArrayList<>();
		kisiler.add(k1);
		kisiler.add(k2);
		kisiler.add(k3);
		
		
	}
	
	
}

public class polymorphism01{
	int a;
	String b;
	
	public polymorphism01(){ //konstruktor 1
		int a;		String b;
	}
	public polymorphism01(String x){ //konstruktor 2
		a = 2;		b = x;
	}
	public void cetak(int a){ //method polymorphism 3
		System.out.println("ini cetak int : "+a);
	}
	public void terbilang(int a){ //method polimorphism 4
		prosesTerbilang(a);
	}
	public void terbilang(String a){ //method polymorphism
		int z = Integer.parseInt(a);
		prosesTerbilang(z);
	}
	public void prosesTerbilang(int a){
		System.out.println("Seratus Rupiah");
	}
	public void cetak(String b){ //method polymorphism
		System.out.println("ini cetak string : "+b);
	}
	public static void main(String [] ammar){
		polymorphism01 objP1 = new polymorphism01();
		objP1.cetak(10);
		objP1.cetak("aldy");
		polymorphism01 objP2 = new polymorphism01("Astri Vitri");
		objP2.cetak(9);
		objP2.cetak("The one and only");
		objP2.terbilang(100);
		objP2.terbilang(100);
	}
}
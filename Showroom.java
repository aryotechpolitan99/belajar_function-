public class Showroom{
	public static void main(String[] args){
		// membuat object atau instansiasi/instance
		//tulis namaClass namaObject = new Contructor();
		/*Mobil mobilBWM = new Mobil();
		mobilBWM.merk = "BWM";
		mobilBWM.warna = "Biru";
		mobilBWM.jumlahpintu = 3;
		mobilBWM.platnomor = "Z 5453 BC";
		mobilBWM.jumlahroda = 4;
		
		System.out.println(mobilBWM.merk);
		System.out.println(mobilBWM.warna);
		System.out.println(mobilBWM.platnomor);
		mobilBWM.nyalakanmesin();
		mobilBWM.maju();*/
		
		Mobil mobilFerrari = new Mobil();
		mobilFerrari.merk = "Ferrari";
		mobilFerrari.warna = "Merah";
		mobilFerrari.jumlahpintu = 2;
		mobilFerrari.platnomor = "B 1 SA";
		mobilFerrari.jumlahroda = 4;
		
		System.out.println(mobilFerrari.merk);
		System.out.println(mobilFerrari.warna);
		System.out.println(mobilFerrari.platnomor);
		mobilFerrari.nyalakanmesin();
		mobilFerrari.maju();
		mobilFerrari.mundur();
	}
}

	class Mobil{
		
		//atribute
		String merk;
		String warna;
		String platnomor;
		int jumlahroda;
		int jumlahpintu;
		boolean nyalakanmesin = true;
		
		
		//method
		public void nyalakanmesin(){
			// code mesin menyala
			if(nyalakanmesin == true){
			System.out.println("Mobil menyala");
			}
			else{
				System.out.println("Mobil mati");
			}
		}
		public void maju(){
			// code mobil maju
			if(nyalakanmesin == true){
			System.out.println("Mobil maju");
			}
			else{
				System.out.println("Mobil mati");
			}
		}
		public void mundur(){
			// code mobil mundur
			if(nyalakanmesin == true){
			System.out.println("Mobil mundur");
			}
			else{
				System.out.println("Mobil mati");
			}
		}
	}
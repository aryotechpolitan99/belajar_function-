public class Function{
	public static void main(String[] args){ // procedure main/utama
		int a = 5;
		int b = 2;
		// procedure HitungLuasSegitiga() digunakan
		HitungLuasSegitiga(a,b); // a dan b ini adalah argumen
		HitungLuasSegitiga(5,2);
		double LuasLingkaran1 = HitungLuasLingkaran(7);
		System.out.println(LuasLingkaran1);
		HitungVolumeTabung(7,2);
	}
	// membuat procedure
	public static void HitungLuasSegitiga(int alas, int tinggi){ // alas dan tinggi adalah parameter
		double luas =(alas * tinggi)/2;
		System.out.println(luas);
	}
	public static double HitungLuasLingkaran(double r){ // function
		final double pi = 3.41;
		double luas = r*r*pi;
		return luas;
	}
	public static void HitungVolumeTabung(double r, double t){
		double LuasLingkaran = HitungLuasLingkaran(r);
		double volume = LuasLingkaran * t;
		System.out.println(volume);
	}
}
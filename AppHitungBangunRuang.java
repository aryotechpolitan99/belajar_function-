import java.util.Scanner;

public class AppHitungBangunRuang{

    public static void main(String[] args){
        boolean hitung = true;
        while( hitung == true){
            menu();
        }

    }
    public static void menu(){
        try{
            Scanner input = new Scanner (System.in);
            System.out.println("=============================");
            System.out.println("Aplikasi Hitung Bangun Ruang");
			System.out.println("=============================");
            System.out.println("1. Hitung Luas Segitiga");
            System.out.println("2. Hitung Volume Balok");
            System.out.println("3. Hitung Volume Prisma Segitiga");
            System.out.println("4. Hitung Volume Kerucut");
            System.out.println("5. Keluar");
            System.out.print("Silahkan pilih salah satu menu : ");
            int pilih = input.nextInt();
            switch(pilih){
                case 1:
                System.out.print("alas : ");double a = input.nextDouble();
                System.out.print("tinggi : ");double t = input.nextDouble();
                System.out.println("Hasil : "+LuasSegitiga(a,t));
				System.out.println();
				System.out.println("1. Kembali ke menu utama");
				System.out.println("2. Keluar");
				System.out.print("Silahkan pilih salah satu menu : ");
				int opsi = input.nextInt();
				switch(opsi){
					case 2:
					System.exit(0);
					break;
				}
                break;
                case 2:
                System.out.print("panjang : "); double p = input.nextDouble();
                System.out.print("lebar : "); double l = input.nextDouble();
                System.out.print("tinggi : "); double t1 = input.nextDouble();
                System.out.println("Hasil : "+VolumeBalok(p,l,t1));
				System.out.println();
				System.out.println("1. Kembali ke menu utama");
				System.out.println("2. Keluar");
				System.out.print("Silahkan pilih salah satu menu : ");
				int opsi1 = input.nextInt();
				switch(opsi1){
					case 2:
					System.exit(0);
					break;
				}
                break;
                case 3:
                System.out.print("panjang : "); double p1 = input.nextDouble();
                System.out.print("lebar : "); double l1 = input.nextDouble();
                System.out.print("tinggi : "); double t2 = input.nextDouble();
                System.out.println("Hasil : "+VolumePrismaSegitiga(p1,l1,t2));
				System.out.println();
				System.out.println("1. Kembali ke menu utama");
				System.out.println("2. Keluar");
				System.out.print("Silahkan pilih salah satu menu : ");
				int opsi2 = input.nextInt();
				switch(opsi2){
					case 2:
					System.exit(0);
					break;
				}
                break;
                case 4:
                System.out.print("jari-jari : "); double r = input.nextDouble();
                System.out.print("tinggi : ");  double t3 = input.nextDouble();
                System.out.println("Hasil : "+VolumeKerucut(r,t3));
				System.out.println();
				System.out.println("1. Kembali ke menu utama");
				System.out.println("2. Keluar");
				System.out.print("Silahkan pilih salah satu menu : ");
				int opsi3 = input.nextInt();
				switch(opsi3){
					case 2:
					System.exit(0);
					break;
				}
                break;
                default:
                System.exit(0);
            }
        }
        catch (Exception e){
            System.out.println("Data haruslah angka");
        }
    }
	 public static double LuasSegitiga(double a,double t){
        double hasil = (a*t)/2;
        return hasil;
    }
    public static double VolumeBalok(double p, double l, double t){
        double hasil = p*l*t;
        return hasil;
    }
    public static double VolumePrismaSegitiga(double p, double l, double t){
        double hasil = (p*l*t)/2;
        return hasil;
    }
    public static double VolumeKerucut(double r, double t){
        double pi = 3.1415926;
        double hasil = (pi*r*r*t)/3;
        return hasil;
    }
}
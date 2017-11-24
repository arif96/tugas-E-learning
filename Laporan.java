import java.util.Scanner;

class Laporan {
	public String no_lap;
	public String tgl_lap;
	public String jenis_lap;

	public void cetak_lap(){
System.out.println("-----------------------------------------------");
System.out.println("=================Data Laporan==================");
System.out.println("-----------------------------------------------");
		System.out.print("No Laporan 	  : ");
		System.out.println(no_lap);
		System.out.print("Tanggal Laporan : ");
		System.out.println(tgl_lap);
		System.out.print("Jenis Laporan   : ");
		System.out.println(jenis_lap);


	}
	public void ubah_lap() {
	

	}

	public void hapus_lap() {

	}
	
	public void buat_lap() {
	Scanner input = new Scanner(System.in);
System.out.println("-----------------------------------------------");
System.out.println("=================Data Laporan==================");
System.out.println("-----------------------------------------------");

	System.out.print("No laporan : ");
	no_lap = input.nextLine();

	System.out.print("Tanggal laporan : ");
	tgl_lap = input.nextLine();

	System.out.print("Jenis Laporan : ");
	jenis_lap = input.nextLine();

	}
	
	
}
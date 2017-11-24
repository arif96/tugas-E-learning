import java.util.Scanner;

class Transaksi {
	public String no_trans;
	public String tgl_trans; 
	

	public void membuat_trans() {
	Scanner input = new Scanner(System.in);
System.out.print("No Transaksi : ");
no_trans = input.nextLine();
System.out.print("Tanggal Transaksi : ");
tgl_trans = input.nextLine();

	}
	public void cetak_trans(){
		System.out.println("Nomor Transaksi   :"+no_trans);
		System.out.println("Tanggal Transaksi :"+tgl_trans);
}
}
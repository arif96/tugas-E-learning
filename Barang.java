import java.util.Scanner;

public class Barang {
	public String nama_brg;
	public int harga_brg;
	public int jumlah;
	public String supplier;
	public int total;
	public char p;
	

	public void tambah() {
		Scanner input = new Scanner(System.in);

	System.out.print("Nama Barang : ");
	nama_brg = input.nextLine();

	System.out.print("supplier : ");
	supplier = input.nextLine();

	System.out.print("Harga barang : ");
	harga_brg = input.nextInt();

	System.out.print("Jumlah Barang : ");
	jumlah = input.nextInt();

	total = harga_brg * jumlah;
	System.out.print("Total pembayaran : ");
	System.out.println(total);
	

	}

	public void ubah() {
		
	}

	public void hapus() {

	}

	public void retur() {

	}

	public void barang(){
		Scanner input = new Scanner (System.in);
		int x;
System.out.println("-----------------------------------------------");
System.out.println("===================Data Barang=================");
System.out.println("-----------------------------------------------");
		System.out.println("Data Barang");
		System.out.println("1.Data Barang Elektronik");
		System.out.println("2.Data Barang Busana");
		System.out.println("3.Data Barang Furniture");
		System.out.println("pilih data yang akan anda masukan ? contoh : 1 ");
		x=input.nextInt();
		while (x>=4){
System.out.println("pilih no di atas !");
System.out.println("-----------------------------------------------");
System.out.println("===================Data Barang=================");
System.out.println("-----------------------------------------------");
		System.out.println("Data Barang");
		System.out.println("1.Data Barang Elektronik");
		System.out.println("2.Data Barang Busana");
		System.out.println("3.Data Barang Furniture");
		System.out.println("pilih data yang akan anda masukan ? contoh : 1 ");
		x=input.nextInt();
		}
		System.out.println();
		if(x==1){
System.out.println("-----------------------------------------------");
System.out.println("===============Data Elektronik=================");
System.out.println("-----------------------------------------------");
			Elektronik elk = new Elektronik();
			Transaksi trn = new Transaksi();
			trn.membuat_trans();
			elk.tambah();
			elk.merk();
			System.out.println("");
System.out.println("-----------------------------------------------");
System.out.println("==================Data Pembelian===============");
System.out.println("-----------------------------------------------");
			trn.cetak_trans();
			elk.cetak_brg();
			elk.cetak_elk();
			System.out.println("");
			System.out.println("apakah anda akan membuat laporan ? (y/t)");
			p = input.next().charAt(0);
				if (p=='y'){
					Laporan lap = new Laporan();
					System.out.println("");
					lap.buat_lap();
					lap.cetak_lap();
					trn.cetak_trans();
					elk.cetak_brg();
					elk.cetak_elk();
				}
				else{
					System.out.println("Terima Kasih");
System.out.println("-----------------------------------------------");
System.out.println("==================Data Pembelian===============");
System.out.println("-----------------------------------------------");
			trn.cetak_trans();
			elk.cetak_brg();
			elk.cetak_elk();
				}
		}
		else if(x==2){
System.out.println("-----------------------------------------------");
System.out.println("===================Data Busana=================");
System.out.println("-----------------------------------------------");
			Busana bsn = new Busana();
			Transaksi trn = new Transaksi();
			trn.membuat_trans();
			bsn.tambah();
			bsn.ukuran();
			System.out.println("");
System.out.println("-----------------------------------------------");
System.out.println("==================Data Pembelian===============");
System.out.println("-----------------------------------------------");
			trn.cetak_trans();
			bsn.cetak_brg();
			bsn.cetak_bsn();
			System.out.println("");
			System.out.println("apakah anda akan membuat laporan ? (y/t)");
			p = input.next().charAt(0);
				if (p=='y'){
					Laporan lap = new Laporan();
					System.out.println("");
					lap.buat_lap();
					lap.cetak_lap();
					trn.cetak_trans();
					bsn.cetak_brg();
					bsn.cetak_bsn();
				}
				else{
					System.out.println("Terima Kasih");
System.out.println("-----------------------------------------------");
System.out.println("==================Data Pembelian===============");
System.out.println("-----------------------------------------------");
			trn.cetak_trans();
			bsn.cetak_brg();
			bsn.cetak_bsn();
				}
		}else if(x==3){
System.out.println("-----------------------------------------------");
System.out.println("================Data Furniture=================");
System.out.println("-----------------------------------------------");
			Furniture ftr = new Furniture();
			Transaksi trn = new Transaksi();
			trn.membuat_trans();
			ftr.tambah();
			ftr.jenis();
			System.out.println("");
System.out.println("-----------------------------------------------");
System.out.println("==================Data Pembelian===============");
System.out.println("-----------------------------------------------");
			trn.cetak_trans();
			ftr.cetak_brg();
			ftr.cetak_ftr();
			System.out.println("");
			System.out.println("apakah anda akan membuat laporan ? (y/t)");
			p = input.next().charAt(0);
				if (p=='y'){
					Laporan lap = new Laporan();
					System.out.println("");
					lap.buat_lap();
					lap.cetak_lap();
					trn.cetak_trans();
					ftr.cetak_brg();
					ftr.cetak_ftr();
				}
				else{
					System.out.println("Terima Kasih");
System.out.println("-----------------------------------------------");
System.out.println("==================Data Pembelian===============");
System.out.println("-----------------------------------------------");
			trn.cetak_trans();
			ftr.cetak_brg();
			ftr.cetak_ftr();
				}
	}
	else {
			System.out.println("pilih no di atas !");
		}
	}
	public void cetak_brg(){

		System.out.println("Nama Barang 	  : "+ nama_brg);
		System.out.println("Harga Barang 	  : "+ harga_brg);
		System.out.println("Jumlah Barang 	  : "+ jumlah);
		System.out.println("Total pembayaran  : "+ total);
		
	}
			
}
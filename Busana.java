import java.util.Scanner;

public class Busana extends Barang{
	public String ukuran;

	public void ukuran() {

	Scanner input = new Scanner(System.in);
	System.out.print("ukuran barang (S/M/L/Xl/XXl/XXXl ) : ");
	ukuran = input.nextLine();
	}
	public void cetak_bsn(){
		System.out.println("ukuran barang 	  : " + ukuran);
	}
}

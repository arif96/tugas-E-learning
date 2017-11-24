import java.util.Scanner;


public class Elektronik extends Barang{
	public String merk;

	public void merk() {

	Scanner input = new Scanner(System.in);
System.out.print("Merk barang : ");
	merk = input.nextLine();
	}
	public void cetak_elk(){
		System.out.println("Merk 		  : " + merk);
	}
}

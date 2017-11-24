import java.util.Scanner;

public class Furniture extends Barang{
public String jenis;

	public void jenis() {

	Scanner input = new Scanner(System.in);
System.out.print("bahan barang : ");
	jenis = input.nextLine();
	}
	public void cetak_ftr(){
		System.out.println("bahan barang 	  : " + jenis);
	}
	
}

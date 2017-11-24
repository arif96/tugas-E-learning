import java.util.Scanner;

class Admin {
	public String nama;

	public void input_admin() {
		Scanner input = new Scanner(System.in);
System.out.println("-----------------------------------------------");
System.out.println("====================Login======================");
System.out.println("-----------------------------------------------");
System.out.print("Nama anda : ");
nama = input.nextLine();
	}
	public void cetak_admin(){
	System.out.println("				Nama Admin :" + nama);
	}
}
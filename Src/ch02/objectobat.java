public class ObjectObat {
     public static void main(String []args){
	   
	   obat x1 = new obat();
	   x1.barcode = "452662272";
	   x1.nama = "paramax";
	   x1.tanggalKadaluarsa = new Date (2020,10,20);
	   x1.harga = 6000;
	   
	   obat x2 = new obat();
	   x2.barcode = "388838838";
	   x2.nama = "badrex";
	   x2.tanggalKadaluarsa = new Date (2020,09,14);
	   x2.harga = 7500;
	   
	   System.out.println(x1.nama + "(  "+ x1.barcode + ")");
	   System.out.println("Harga: Rp" + x1.harga);
	   System.out.println("Exp:  "+ x1.tanggalKadaluarsa.toString());
	   
	   System.out.println("====================");
	   
	   	   System.out.println(x2.nama + "(  "+ x2.barcode + ")");
	   System.out.println("Harga: Rp" + x2.harga);
	   System.out.println("Exp:  "+ x2.tanggalKadaluarsa.toString());
	   
	 }
}
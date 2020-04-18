public class ObjectProduk {
     public static void main(String []args){
	   produk x1 = new produk();
	   x1.barcode = "452662272";
	   x1.nama = "pepsident";
	   x1.tanggalKadaluarsa = new Date (2021,10,11);
	   x1.harga = 5000;
	   
	   produk x2 = new produk();
	   x2.barcode = "388838838";
	   x2.nama = "kitkat";
	   x2.tanggalKadaluarsa = new Date (2022,07,21);
	   x2.harga = 7800;
	   
	   System.out.println(x1.nama + "(  "+ x1.barcode + ")");
	   System.out.println("Harga: Rp" + x1.harga);
	   System.out.println("Exp:  "+ x1.tanggalKadaluarsa.toString());
	   
	   System.out.println("====================");
	   
	   	   System.out.println(x2.nama + "(  "+ x2.barcode + ")");
	   System.out.println("Harga: Rp" + x2.harga);
	   System.out.println("Exp:  "+ x2.tanggalKadaluarsa.toString());
	   
	 }
}
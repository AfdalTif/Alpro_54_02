public class ObjectMahasiswa {
     public static void main(String []args){
		 pegawai pgw1 = new pegawai();
         pegawai pgw2 = new pegawai();

         pgw1.nik = "123";
         pgw1.nama = "Andi";
         pgw1.jabatan = "Staff";
         pgw1.isAktif = "true";

         pgw2.nik = "124";
         pgw2.nama = "Cici";
         pgw2.jabatan = "Administrasi";
         pgw2.isAktif = "true";
		 
		 pgw1.cetak();
		 System.out.println("========");
		 pgw2.cetak();
		 
	 }
}
		 
public class ObjectJurusan {
     public static void main(String []args){
		 jurusan j1 = new jurusan();
		 jurusan j2 = new jurusan();
		 jurusan j3 = new jurusan();
		  
		 j1.nama = "Teknik Informatika";
		 j1.akreditasi = "A";
		 j1.jumlahMahasiswa = "1200";
		 
		 j2.nama = "Sistem Informasi";
		 j2.akreditasi = "A";
		 j2.jumlahMahasiswa = "1109";
		 
		 j3.nama = "Teknik Elektro";
		 j3.akreditasi = "B";
		 j3.jumlahMahasiswa = "980";
		 
		 System.out.println("jurusan 1");
		 System.out.println("Nama : " + j1.getnama());
		 System.out.println("Akreditasi : "+ j1.getakreditasi());
		 System.out.println("Jumlah : "+ j1.getjumlahMahasiswa());
		 
		 System.out.println("jurusan 2");
		 System.out.println("Nama : " + j2.getnama());
		 System.out.println("Akreditasi : "+ j2.getakreditasi());
		 System.out.println("Jumlah : "+ j2.getjumlahMahasiswa());
		 
		 System.out.println("jurusan 3");
		 System.out.println("Nama : " + j3.getnama());
		 System.out.println("Akreditasi : "+ j3.getakreditasi());
		 System.out.println("Jumlah : "+ j3.getjumlahMahasiswa());
		 
	 }
}
		 
		 
		 
		 
public class Pegawai {
     String nik;
	 String nama;
	 String jabatan;
	 boolean isAktif;
	 
	 
	 public String getnik() {
	     return nik;
		 }
	 public String getnama() {
	     return nama;
		 }	 
	 public String getjabatan() {
	     return jabatan;
		 }	 
	 public boolean getisAktif() {
	     return isAktif;
		 }
   
   public void cetak () {
      System.out.println("Nik : " +nik);
	  System.out.println("Nama : " +nama);
	  System.out.println("Jabatan : " +jabatan);
	  System.out.println("Status : " +isAktif);
	  }
	  
	  }
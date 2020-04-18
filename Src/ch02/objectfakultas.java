public class ObjectJurusan {
     public static void main(String []args){
	   fakultas fk1 = new fakultas();
	   fakultas fk2 = new fakultas();
	   
	   fk1.nama = "Sains dan Tekhnologi";
	   fk1.jumlahMahasiswa = "1900";
	   
	   fk2.nama = "Psikilogi";
	   fk2.jumlahMahasiswa = "550";
	   
	   System.out.println("Fakultas "+fk1.getnama()  +": "+ fk1.getjumlahMahasiswa());
	   System.out.println("Fakultas "+fk2.getnama()  +": "+ fk2.getjumlahMahasiswa());
	 }
}
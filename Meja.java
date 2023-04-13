/*
Nama program : Menghitung Luas Meja
Nama         : MIRANTI
NIM          :22323023
*/


public class Meja //Nama kelas dari program yang kita buat jadi program ini diberi nama Meja
{ //membuka steatment untuk membuat perintah class
 public int kaki_Meja () //membuka tipe data integer pada program class Meja
    { //membuka steatment untuk membuat perintah class
   return 70; //mengembalikan nilai pada function
 } //menutup steatmen pada class

 public int alas_Meja () //membuka tipe data integer pada program class Meja
    { //membuka steatment untuk membuat perintah class
   return 120;
 } //menutup steatmen pada class

public static void main(String [] args) //sebeuah metod untuk menjalankan program yang memiliki nilai balikan dan memiliki arguments   
    { //membuka steatment untuk membuat perintah class
	Meja baru=new Meja(); //Membuat variabel baru dengan program meja baru menjadi New Meja

    int kaki=baru.kaki_Meja(); //memanggil variabel meja dengan menambahkan baru  class kaki_Meja dengan menggunakan integer

    int alas=baru.alas_Meja(); //memanggil  variabel meja dengan menambahkan baru class alas_Meja dengan menggunakan integer

 System.out.println(kaki*alas); //menampilkan hasil dari operasi perhitungan aritmatika ke layar monitor
   } //menutup steatmen pada class
} //menutup steatmen pada class
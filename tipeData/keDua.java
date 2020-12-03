public class keDua {
	public static void main(String[] args) {
		//Deklarasi variabel dan tipe datanya
		int gajiPokok;
		float potonganGaji, gajiBersih;
		String namaKaryawan, kodeKaryawan;
		char golDarah;

		//assignment nilai pada setiap variabel
		kodeKaryawan = "K00001";
		namaKaryawan = "Rahmdani";
		golDarah = 'B';
		gajiPokok = 3500000;
		potonganGaji = (float) 0.2;
		gajiBersih = gajiPokok - (potonganGaji * gajiPokok);

		//Tampilkan output
		System.out.println("Kode Karyawan 	: "+ kodeKaryawan);
		System.out.println("Nama Karyawan 	: "+ namaKaryawan);
		System.out.println("Gol Darah 	: "+ golDarah);
		System.out.println("Gaji Pokok  	: Rp. "+ gajiPokok);
		System.out.println("Gaji Bersih 	: Rp. "+ gajiBersih);
	}
}
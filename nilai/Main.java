import java.util.Scanner;

class Main {
    public static void main(String[] args){
        String nama;
        Integer nim;
        double nilai_tubes, nilai_quiz, nilai_tugas, nilai_uts, nilai_uas;
        Scanner input = new Scanner(System.in);
        Nilai penghitung_nilai = new Nilai();

        System.out.print("Masukkan nama anda: ");
        nama = input.next();

        System.out.print("Masukkan NIM anda: ");
        nim = input.nextInt();

        System.out.print("Masukkan nilai tubes: ");
        nilai_tubes = input.nextDouble();

        System.out.print("Masukkan nilai quiz: ");
        nilai_quiz = input.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        nilai_tugas = input.nextDouble();

        System.out.print("Masukkan nilai uts: ");
        nilai_uts = input.nextDouble();

        System.out.print("Masukkan nilai uas: ");
        nilai_uas = input.nextDouble();


        double nilai_rata = penghitung_nilai.total_nilai(nilai_tubes, nilai_quiz, nilai_tugas, nilai_uts, nilai_uas);

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Rata-rata mahasiswa adalah " + nilai_rata);

        input.close();
    }
}

class Nilai {
    double nilai_tubes, nilai_quiz, nilai_tugas, nilai_uts, nilai_uas;

    public double total_nilai(double nilai_tubes, double nilai_quiz, double nilai_tugas, double nilai_uts, double nilai_uas ){
        return ((30/100 * nilai_tubes) + (10/100 * nilai_quiz) + (10/100 * nilai_tugas) + (25/100 * nilai_uts) + (25/100 * nilai_uas));
    }
}

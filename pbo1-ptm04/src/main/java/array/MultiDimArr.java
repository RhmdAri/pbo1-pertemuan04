/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Welcomp
 */
public class MultiDimArr {
    public static void main(String[] args) {
        double[][] nilaiMahasiswa = new double[5][30];
        
        nilaiMahasiswa[0][0] = 80;
        nilaiMahasiswa[1][0] = 90;
        nilaiMahasiswa[2][0] = 75;
        nilaiMahasiswa[3][0] = 70;
        
        nilaiMahasiswa[4][0] = nilaiMahasiswa[0][0] * bobot [0] +
                nilaiMahasiswa[1][0] * bobot [1] +
                nilaiMahasiswa[2][0] * bobot [2] +
                nilaiMahasiswa[0][0] * bobot [0];
        
        System.out.println("Nilai si mahasiswa 1 : " + nilaiMahasiswa[4][1]);
        
        nilaiMahasiswa[0][0] = 80;
        nilaiMahasiswa[1][0] = 90;
        nilaiMahasiswa[2][0] = 75;
        nilaiMahasiswa[3][0] = 70;
        
        nilaiMahasiswa[4][1] = 0;
        for (int i=0 ; i<=3 ; i++){
            nilaiMahasiswa[4][1] += nilaiMahasiswa[i][1] * bobot[i];
        }
        
        System.out.println("Nilai si mahasiswa 2 : " + nilaiMahasiswa[4][1]);
        
        double jumlahNilaiAkhir = 0;
        for(int i=0 ; i<=3 ; i++){
            jumlahNilaiAkhir += nilaiMahasiswa[4][1];
        }
        System.out.println(jumlahNilaiAkhir);
    }
}

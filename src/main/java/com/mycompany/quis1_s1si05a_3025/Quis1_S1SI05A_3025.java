/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_s1si05a_3025;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author acer
 */
public class Quis1_S1SI05A_3025 {

    public static void main(String[] args) {
        Mahasiswa_3025 A = new Mahasiswa_3025();
        Mahasiswa_3025 B = new Mahasiswa_3025();
        Dosen_3025 C = new Dosen_3025();
        Dosen_3025 D = new Dosen_3025();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK     : ");
            A.NIK_3025 = br.readLine();
            System.out.println("Nama    : ");
            A.nama_3025 = br.readLine();
            System.out.println("Umur    : ");
            A.umur_3025 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            A.alamat_3025 = br.readLine();
            System.out.println("NIM     : ");
            A.nim_3025 = br.readLine();
            System.out.println("IPK     : ");
            A.ipk_3025 = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK     : ");
            B.NIK_3025 = br.readLine();
            System.out.println("Nama    : ");
            B.nama_3025 = br.readLine();
            System.out.println("Umur    : ");
            B.umur_3025 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            B.alamat_3025 = br.readLine();
            System.out.println("NIM     : ");
            B.nim_3025 = br.readLine();
            System.out.println("IPK     : ");
            B.ipk_3025 = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK             : ");
            C.NIK_3025 = br.readLine();
            System.out.println("Nama            : ");
            C.nama_3025 = br.readLine();
            System.out.println("Umur            : ");
            C.umur_3025 = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            C.alamat_3025 = br.readLine();
            System.out.println("NIDN            : ");
            C.NIDN_3025 = br.readLine();
            System.out.println("Golongan        : ");
            C.gol_3025 = br.readLine();
            System.out.println("Gaji Pokok      : ");
            C.gajiPokok_3025 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK             : ");
            D.NIK_3025 = br.readLine();
            System.out.println("Nama            : ");
            D.nama_3025 = br.readLine();
            System.out.println("Umur            : ");
            D.umur_3025 = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            D.alamat_3025 = br.readLine();
            System.out.println("NIDN            : ");
            D.NIDN_3025 = br.readLine();
            System.out.println("Golongan        : ");
            D.gol_3025 = br.readLine();
            System.out.println("Gaji Pokok      : ");
            D.gajiPokok_3025 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("==== DATA MAHASISWA ====");
            A.tampilDataMahasiswa();
            A.tampilDataBeasiswa();
            System.out.println("");
            B.tampilDataMahasiswa();
            B.tampilDataBeasiswa();
            System.out.println("====== DATA DOSEN ======");
            C.tampilDataDosen();
            System.out.println("Total Pendapatan    : Rp "+C.totalPendapatan());
            System.out.println("");
            System.out.println("Total Pendapatan    : Rp "+D.totalPendapatan());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    }

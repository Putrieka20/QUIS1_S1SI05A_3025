/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_s1si05a_3025;

/**
 *
 * @author acer
 */
public class Mahasiswa_3025 extends Penduduk_3025{
    String nim_3025;
    float ipk_3025;
    
    public void tampilDataMahasiswa(){
        tampilDataPenduduk();
        System.out.println("NIM     : "+nim_3025);
        System.out.println("IPK     : "+ipk_3025);
    }
    public void tampilDataBeasiswa(){
        if(ipk_3025 > 3.5){
            System.out.println("Mahasiswa bernama "+ nama_3025 +" berhak mendapatkan beasiswa");
        }else{
            System.out.println("Mahasiswa bernama "+ nama_3025 +" tidak berhak mendapatkan beasiswa");
        }
    }
}

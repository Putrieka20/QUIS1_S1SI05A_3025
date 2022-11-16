/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_s1si05a_3025;

/**
 *
 * @author acer
 */
public class Dosen_3025 extends Penduduk_3025 {
    String NIDN_3025,gol_3025;
    int gajiPokok_3025,tunjangan_3025;
    double gajitotal_3025;
    
    public double totalPendapatan(){
        switch(gol_3025){
            case "IIIA":
                tunjangan_3025 = 300000;
            break;
            case "IIIB":
                tunjangan_3025 = 500000;
            break;
            case "IIIC":
                tunjangan_3025 = 700000;
            break;
        }
        gajitotal_3025 = gajiPokok_3025 + tunjangan_3025;
        return gajitotal_3025;
    }
    public void tampilDataDosen(){
        tampilDataPenduduk();
        System.out.println("NIDN        : "+NIDN_3025);
        System.out.println("Golongan    : "+gol_3025);
        System.out.println("Gaji Pokok  : "+gajiPokok_3025);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author fauziah
 */
public class Herbivora {
    public static void main(String[] args) {
        Hewan kelinci = new Hewan();
        
        kelinci.setNama("kelinci");
        kelinci.setCaraberkembangbiak("vivipar");
        kelinci.setSifat("jinak");
        kelinci.setUmur(1);
        
        System.out.println("Nama makhluk hidup"+ kelinci.getNama());
        System.out.println("Berkembang biak dengan"+kelinci.getCaraberkembangbiak());
        System.out.println("memiliki sfat"+kelinci.getSifat());
        System.out.println("berumur" + kelinci.getUmur());
    }
}

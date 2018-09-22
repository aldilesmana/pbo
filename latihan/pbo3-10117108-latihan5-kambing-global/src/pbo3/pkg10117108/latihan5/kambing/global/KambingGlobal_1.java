/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117108.latihan5.kambing.global;

/**
 *
 * @author Budiana
 */
class KambingGlobal {
     public static void main(String[] args) {
        //variabel jumlahkambing menjadi variabel instance
       int jumlahKambing = 88;
    }   
       //method untuk menampilkan jumlah kambing
    
    public void getJumlahKambing() {
       String jumlahKambing = null;
        System.out.println("Jumlah kambing: " + jumlahKambing);  
    }  
    
    public void tambahKambing(int jumlahKambing){

        jumlahKambing = jumlahKambing = 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
     public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        
        // menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
         int jumlahKambing = 0;
        
        //menambah satu kambing
        kambingSusu.tambahKambing(jumlahKambing);
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
        
    }
    


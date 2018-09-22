/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117108.latihan5.kambingglobal;

/**
* di buat jam 21.50
 * 21 september 2018
 * @author Aldi Lesmana
 * nim 10117108
 * kelas if-3
 */
class KambingGlobal {
       // variabel jumlahkambing menjadi variabel instance
        
        int jumlahKambing = 88;
        
        //method untuk menampilkan jumlah kambing
        public void getJumlahKambing(){
            System.out.println("Jumlah kambing : " + jumlahKambing);
        }
        
        public void tambahKambing(){
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah kambing setelah ditambah : " +
                    jumlahKambing);
            
        }
        
        public static void main(String[] args){
            KambingGlobal kambingSusu = new KambingGlobal();
            
            //menampilkan jumlah kambing yang ada saat program pertama x berjalan
            kambingSusu.getJumlahKambing();
            
            //menambah satu kambing
            kambingSusu.tambahKambing();
            
            //menampilkan jumlah kambing yang ada
            kambingSusu.getJumlahKambing();

        }
}

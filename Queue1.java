import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) throws Exception {
        Queue <String> antrian = new LinkedList<>();

        antrian.add("Bono");
        antrian.add("Lom");
        antrian.add("Ing");
        antrian.add("Loop");
        antrian.add("Kera");
        antrian.add("Look");
        antrian.add("Pon");
        antrian.add("Safe");
        
        System.out.println("Kondisi antrian saat ini " + antrian);
        System.out.println("Jumlah antrian : " + antrian.size());

        antrian.remove();
        antrian.remove();
        antrian.remove();
        System.out.println("");
        System.out.println("Mengecek kondisi antrian, Sudah kosongkah? : " + antrian.isEmpty());
        
        System.out.println("");
        System.out.println("Antrian Pertama : " + antrian.poll());
        System.out.println("Antrian Selanjutnya : " + antrian.poll());

        System.out.println("");
        System.out.println("Antrian yang tersisa : " + antrian );
        System.out.println("Jumlah antrian : " + antrian.size());
        System.out.println("");

        
        System.out.println("Toko akan tutup , Stok Habis");
        antrian.clear();
        System.out.println("Antrian yang tersisa : " + antrian );
        System.out.println("Jumlah antrian : " + antrian.size());
        System.out.println("");
    }
}

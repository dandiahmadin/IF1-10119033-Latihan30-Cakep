/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan30.cakep;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi percabangan
 */
public class IF110119033Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    static String 
            resetColor = "\033[0m",
            merah = "\033[0;31m",
            hijau = "\033[0;32m",
            kuning = "\033[0;33m",
            biru = "\033[0;34m",
            ungu = "\033[0;35m",
            cyan = "\033[0;36m",
            answer;
    
    static void masukanJawaban() {
        Scanner scanner = new Scanner (System.in);
       
        System.out.print(merah.concat("Kamu ")
                .concat(hijau).concat("ngerjain sendiri ")
                .concat(kuning).concat("latihan 17 sampe ")
                .concat(biru).concat("latihan 30 ini?\n")
                .concat(biru).concat("Jawab ")
                .concat(merah).concat("(Yoi/Enggak) : ").concat(resetColor));
        answer = scanner.next();
    }
    
    static String jawaban(String paramAnswer) {
        if (paramAnswer.toUpperCase().equals("YOI")) {
            return merah.concat("Cakep Bener. ").concat(ungu).concat("Good Job");
        } else {
            return merah.concat("Tetep cakep sih.\n")
                    .concat(cyan).concat("Sing penting paham konsep nya yee.\n")
                    .concat("Keep the code works dude");
        }
    }
    
    static void tampilHasil() {
        System.out.println();
        System.out.println(jawaban(answer));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        masukanJawaban();
        tampilHasil();
       
    }
    
}

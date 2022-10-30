package day01Variables;

import java.util.Scanner;

public class variables01 {
    public static void main(String[] args) {

        Scanner unit= new Scanner(System.in);
        System.out.println("adinizi girin");
String Isim=unit.nextLine();
        System.out.println("soyadinizi girin");
        String Soyad=unit.nextLine();
        System.out.println("yasinizi girin");
        Byte Yas=unit.nextByte();
        System.out.println(Isim +" " +Soyad  +" "+Yas +" yasindasin");



    }

}

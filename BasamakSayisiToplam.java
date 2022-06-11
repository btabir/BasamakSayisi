package Hesaplamalar;

import java.util.Scanner;

public class BasamakSayisiToplam {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Sayiyi Giriniz :");

        int number=input.nextInt();
        int total=0;

        do{
            int lastDigit = number % 10;
            number /=10;
            System.out.print(lastDigit);
            if(number != 0){
                System.out.print("+");
            }
            total += lastDigit;
        }while(number != 0);

        System.out.print(" = " + total);
    }
}

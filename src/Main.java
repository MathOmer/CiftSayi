import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i=2;i<=sayi;i+=2){
            System.out.print(i+",");
        }
    }
}
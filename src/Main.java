import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sicaklik ;

        System.out.println("Lütfen Sıcaklık Giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak");
        }else if (sicaklik >= 5 && sicaklik < 15){
            System.out.println("Sinema");
        }else if (sicaklik >= 15 && sicaklik < 25){
            System.out.println("Piknik");
        }else
        {
            System.out.println("Yüzme");
        }
    

    }
}

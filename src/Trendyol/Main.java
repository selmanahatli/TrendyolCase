package Trendyol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Creator[] creators = {

                new YarımKolluTisortCreator(),
                new KolsuzTisortCreator(),
                new KumasPantolonCreator(),
                new KotPantolonCreator(),
                new SaatCreator(),
        };

        ArrayList<Product> products = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int catCode;

        //Değişken tipinin doğru girilip girilmediğini kontrol etmedim
        //Lütfen dikkat ediniz
        //Exception fırlatırsa o yüzdendir

        while (true) {
            System.out.println("Please enter cat code");
            System.out.println("PS: If it isn't 1 between 5, this programme will exit");
            catCode = Integer.parseInt(in.nextLine());

            if (catCode == 1) {
                Product product = creators[0].Factory();
                products.add(product);
            } else if (catCode == 2) {
                Product product = creators[1].Factory();
                products.add(product);
            } else if (catCode == 3) {
                Product product = creators[2].Factory();
                products.add(product);
            } else if (catCode == 4) {
                Product product = creators[3].Factory();
                products.add(product);
            } else if (catCode == 5) {
                Product product = creators[4].Factory();
                products.add(product);
            } else {
                break;
            }
        }
    }
}

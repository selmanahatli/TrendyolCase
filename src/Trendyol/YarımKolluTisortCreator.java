package Trendyol;

import java.util.Scanner;

/**
 * Created by Selman Ahatlı on 24.05.2017.
 */
public class YarımKolluTisortCreator extends Creator {
    @Override
    public Product Factory() {

        //Değişken tipinin doğru girilip girilmediğini kontrol etmedim
        //Lütfen dikkat ediniz
        //Exception fırlatırsa o yüzdendir

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter product name:");
        String ProductName = in.nextLine();

        System.out.println("Please enter id:");
        int Id = Integer.parseInt(in.nextLine());

        System.out.println("Please enter color:");
        String Color = in.nextLine();

        System.out.println("Please enter fabric type:");
        String FabricType = in.nextLine();

        System.out.println("Please enter Collar type:");
        String CollarType = in.nextLine();

        System.out.println("Please enter size:");
        int Size = Integer.parseInt(in.nextLine());

        System.out.println("Please enter price:");
        int Price = Integer.parseInt(in.nextLine());

        return new YarımKolluTisort(ProductName, Id, Color, FabricType, CollarType, Size, Price);
    }
}

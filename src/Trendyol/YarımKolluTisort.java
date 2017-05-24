package Trendyol;

/**
 * Created by Selman Ahatlı on 24.05.2017.
 */
public class YarımKolluTisort extends Product {

    public YarımKolluTisort(String productName, int id, String color, String fabricType, String collarType, int size, int price) {

        this.ProductName = productName;
        this.Id = id;
        this.Color = color;
        this.FabricType = fabricType;
        this.CollarType = collarType;
        this.Size = size;
        this.Price = price;

        print();
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Yarım Kollu Tişört");
        System.out.println("--------------------------------------------------------------");
        super.print();

    }
}

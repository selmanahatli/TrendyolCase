package Trendyol;

/**
 * Created by Selman Ahatlı on 24.05.2017.
 */
public class Saat extends Product {
    public Saat(String productName, int id, String color, int price) {

        this.ProductName = productName;
        this.Id = id;
        this.Color = color;
        this.FabricType = null;
        this.CollarType = null;
        this.Size = 0;
        this.Price = price;

        print();
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Saat");
        System.out.println("--------------------------------------------------------------");
        super.print();

    }
}

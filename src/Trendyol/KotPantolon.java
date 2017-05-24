package Trendyol;

/**
 * Created by Selman Ahatlı on 24.05.2017.
 */
public class KotPantolon extends Product {
    public KotPantolon(String productName, int id, String color, String fabricType, int size, int price) {

        this.ProductName = productName;
        this.Id = id;
        this.Color = color;
        this.FabricType = fabricType;
        this.CollarType = null;
        this.Size = size;
        this.Price = price;

        print();
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Kot Pantolon");
        System.out.println("--------------------------------------------------------------");
        super.print();

    }
}

package Trendyol;

/**
 * Created by Selman Ahatlı on 24.05.2017.
 */
public class KumasPantolon extends Product {
    public KumasPantolon(String productName, int id, String color, String fabricType, int size, int price) {

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
        System.out.println("Kumaş Pantolon");
        System.out.println("--------------------------------------------------------------");
        super.print();

    }
}

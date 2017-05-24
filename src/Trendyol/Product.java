package Trendyol;

/**
 * Created by Selman Ahatlı on 24.05.2017.
 */
public abstract class Product {

    String ProductName;
    int Id;
    String Color;
    String FabricType;
    String CollarType;
    int Size;
    int Price;

    public void print() {

        System.out.println("Product Name = " + ProductName);
        System.out.println("Id = " + Id);
        System.out.println("Color = " + Color);

        if (FabricType != null)
            System.out.println("Fabric Type = " + FabricType);

        if (CollarType != null)
            System.out.println("Collar Type = " + CollarType);

        if (Size != 0)
            System.out.println("Size = " + Size);

        System.out.println("Price = " + Price);
        System.out.println("--------------------------------------------------------------");
        System.out.println();
    }
}

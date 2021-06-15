public class GibsonCustomer extends GuitarStore{
    @Override
    String productBrand() {
        brand = "Gibson ";
        return brand;
    }

    @Override
    String productModel() {
        model = " Les Paul Standard '60s";
        return model;
    }

    @Override
    String productPrice() {
        price = " 1800$ ";
        return price;
    }
}

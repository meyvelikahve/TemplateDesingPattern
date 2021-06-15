public abstract class GuitarStore {
    protected String brand;
    protected String model;
    protected String price;

    abstract String productBrand();
    abstract String productModel();
    abstract String productPrice();
    public String templateMethod(){
        return  productBrand() + productModel() + productPrice();
    }
}

public class Main {
    public static void main(String[] args) {
        GuitarStore fenderCustomer = new FenderCustomer();
        System.out.println(fenderCustomer.templateMethod());

        GuitarStore gibsonCustomer = new GibsonCustomer();
        System.out.println(gibsonCustomer.templateMethod());


    }
}

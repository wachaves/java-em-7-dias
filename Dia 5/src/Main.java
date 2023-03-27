public class Main {
    public static void main(String[] args) {
        productList("Laranja", 12.20);
        productList("Banana", 17.50);

    }
    public static void productList(String produtcName, Double productValue) {
        System.out.println(produtcName + " - " + productValue);
    }
}
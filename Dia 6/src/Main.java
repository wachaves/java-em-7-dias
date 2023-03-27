public class Main {
    public static void main(String[] args) {

//        Clients c001 = new Clients();
//        c001.firstName = "William";
//        c001.age = 36;
//
//        Clients c002 = new Clients();
//        c002.firstName = "Fabiana";
//        c002.age = 38;
//
//        c002.newAccount();


        Car car = new Car("BMW", "X6", 2023, 125_000);

        car.setMarca("Nissan");
        car.setModelo("Kicks");
        car.setAno(2024);

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor de venda: " + car.valorVenda());
    }
}
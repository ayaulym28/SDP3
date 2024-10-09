public class Client {
    public static void main(String[] args) {
        // Создаем фасад для управления процессом покупок
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        // Оформляем заказ
        shoppingFacade.placeOrder("Laptop XYZ", "CreditCard4321");
    }
}

public class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        this.productCatalog = new ProductCatalog();
        this.paymentProcessor = new PaymentProcessor();
        this.inventoryManager = new InventoryManager();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String productId, String paymentDetails) {
        // 1. Поиск продукта
        String product = productCatalog.findProduct(productId);
        System.out.println(product);

        // 2. Проверка наличия на складе
        if (!inventoryManager.checkStock(productId)) {
            System.out.println("Unfortunately, '" + productId + "' is out of stock. Please check back later.");
            return; // Прерываем выполнение, если товара нет
        }

        // 3. Обработка оплаты
        if (paymentProcessor.processPayment(paymentDetails)) {
            // 4. Организация доставки
            String shippingConfirmation = shippingService.arrangeShipping(productId);
            System.out.println(shippingConfirmation);
            System.out.println("Thank you for your purchase! Your order has been successfully placed.");
        } else {
            System.out.println("Payment failed! Please check your payment details and try again.");
        }
    }
}

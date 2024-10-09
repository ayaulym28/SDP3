public class ShippingService {
    public String arrangeShipping(String productId) {
        // Логика организации доставки
        System.out.println("Arranging shipping for '" + productId + "' to your home address...");
        return "Shipping arranged successfully! Your order will be delivered in 3-5 business days.";
    }
}

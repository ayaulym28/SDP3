public class PaymentProcessor {
    public boolean processPayment(String paymentDetails) {
        // Логика обработки платежа
        System.out.println("Processing payment with your card ending in " + paymentDetails.substring(paymentDetails.length() - 4) + "...");
        return true; // Предполагаем, что оплата всегда проходит успешно
    }
}

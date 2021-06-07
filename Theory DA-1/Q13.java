@FunctionalInterface
interface Pizza{
    void deliveryMessage();
}
class PizzaDelivery implements Pizza{
    public void deliveryMessage(){
        System.out.println("Your pizza has been delivered");
    }
}
public class Q13 {
public static void main(String[] args) {
    Pizza pizza = new PizzaDelivery(); // Polymorphic statement
    System.out.println("Using polymorphism");
    pizza.deliveryMessage();
    // Anonymous class implementation
    Pizza pizza1 = new Pizza(){
        @Override
        public void deliveryMessage(){
            System.out.println("Your pizza has been delivered");
        }
    };
    System.out.println("\nUsing anonymous class implementation");
    pizza1.deliveryMessage();
    // Using Lambda expressions
    Pizza pizza2 = () -> {
        System.out.println("Your pizza has been delivered");
    };
    System.out.println("\nUsing Lambda expressions");
    pizza2.deliveryMessage();
    }
}
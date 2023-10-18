import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {

    private Queue<String> queue = new LinkedList<>();

    // Реализация методов из интерфейса QueueBehaviour
    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public int getSize() {
        return queue.size();
    }

    // Реализация методов из интерфейса MarketBehaviour
    @Override
    public void addPerson(String person) {
        enqueue(person);
    }

    @Override
    public void removePerson(String person) {
        queue.remove(person);
    }

    // Метод update, который обновляет состояние магазина
    public void update() {
        // Принимаем заказы
        acceptOrders();
        // Отдаем заказы
        deliverOrders();
    }

    private void acceptOrders() {
        System.out.println("Заказы принимаются...");
    }

    private void deliverOrders() {
        System.out.println("Заказы отданы...");
    }

    public static void main(String[] args) {
        Market market = new Market();

        market.addPerson("John");
        market.addPerson("Alice");
        market.addPerson("Bob");
        market.removePerson("Alice");

        System.out.println("Количество человек в очереди: " + market.getSize());

        market.update();
    }
}
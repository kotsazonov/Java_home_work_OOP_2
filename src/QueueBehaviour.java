public interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
    int getSize();
}

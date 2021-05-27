import java.util.Stack;

class ProducerConsumerWrapper 
{
	Stack<Integer> container = new Stack<Integer>();
	int capacity = 10;
	int itemsInStack = 0;
	public void produce() throws InterruptedException 
	{

	int value = 0;
	while (true) {
		synchronized (this) {
			while (itemsInStack == capacity) 
			{
				System.out.println("Waiting for more chapatis");
			wait();
			}
		System.out.println("Mother prepared chapati: #" + value);
container.push(value++);
itemsInStack++;
notify();
Thread.sleep(1000);
}
}
}
public void consume() throws InterruptedException {
while (true) {
synchronized (this) {
while (container.isEmpty()) {
System.out.println("Container empty, waiting for more chapatis");
wait();
}
int value = container.pop();
itemsInStack--;
System.out.println("Someone picked chapati #" + value);
notify();
Thread.sleep(1000);
}
}
}
}
public class Q5 {
    public static void main(String[] args) throws InterruptedException {
    final ProducerConsumerWrapper a = new ProducerConsumerWrapper();
    Thread producerThread = new Thread(new Runnable() {
    @Override
    public void run() {
    try {
    a.produce();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }

    });
    Thread consumerThread = new Thread(new Runnable() {
    @Override
    public void run() {
    try {
    a.consume();
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    });
    producerThread.start();
    consumerThread.start();
    producerThread.join();
    consumerThread.join();
    }
}

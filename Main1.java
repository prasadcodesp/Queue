/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// A Linked List Node
class Node
{
    int data;       // integer data
    Node next;      // pointer to the next node
 
    public Node(int data)
    {
        // set data in the allocated node and return it
        this.data = data;
        this.next = null;
    }
}
 
class Queue
{
    private static Node rear = null, front = null;
    private static int count = 0;

 
    // Utility function to add an item to the queue
    public static void enqueue(int item)     // insertion at the end
    {
        // allocate a new node in a heap
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);
 
        // special case: queue was empty
        if (front == null)
        {
            // initialize both front and rear
            front = node;
            rear = node;
        }
        else {
            // update rear
            rear.next = node;
            rear = node;
        }
 
        // increase the node's count by 1
        count += 1;
    }
 
 
    // Utility function to dequeue the front element
    public static int dequeue()     // delete at the beginning
    {
        if (front == null)
        {
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }
 
        Node temp = front;
        System.out.printf("Removing %d\n", temp.data);
 
        // advance front to the next node
        front = front.next;
 
        // if the list becomes empty
        if (front == null) {
            rear = null;
        }
 
        // decrease the node's count by 1
        count -= 1;
 
        // return the removed item
        return temp.data;
    }

    // Utility function to return the top element in a queue
    public static int peek()
    {
        // check for an empty queue
        if (front == null) {
            System.exit(-1);
        }
 
        return front.data;
    }
 
    // Utility function to check if the queue is empty or not
    public static boolean isEmpty() {
        return rear == null && front == null;
    }
 
    // Function to return the size of the queue
    private static int size() {
        return count;
    }
}
 
class Main1
{
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(1);  // front 
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);	// rear
 
        System.out.printf("The front element is %d\n", q.peek());
 
        q.dequeue(); // 1
        q.dequeue();
        q.dequeue();
        q.dequeue(); // 4
 
        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}

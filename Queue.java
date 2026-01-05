import java.util.Scanner;
public class Queue{
    int front = 0, rear = -1, capacity;
    int[] q;
    Queue(int size){
        capacity = size;
        q=new int[capacity];
    }
    boolean isFull(){
        return rear==capacity -1;
    }
    boolean isEmpty(){
        return front>rear;
    }
    void enqueue(int val){
        if(isFull())
            System.out.println("Queue full\n");
        else q[++rear]=val;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty\n");
            return -1;
        }
        return q[front++];
    }
    void display(){
        if(isEmpty())
            System.out.println("Queue empty\n");
        else{
            for(int i=front; i<=rear; i++)
                System.out.println(q[i]+"\n");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Queue capacity:");
        Queue q1=new Queue(sc.nextInt());
        while(true){
            System.out.println("1.Enqueue\n 2.Dequeue\n 3.Display\n 4.exit\n");
            switch(sc.nextInt()){
                case 1:{
                    System.out.println("Element");
                    q1.enqueue(sc.nextInt());
                    break;
            }
                case 2:{
                    int val=q1.dequeue();
                    if(val!=-1)
                    System.out.println("Dequeue:"+val);
                    break;
            }
                case 3:{
                    q1.display();
                    break;
            }
                case 4:{
                    System.out.println("Exit");
                    sc.close();
                    return;
            }
            default:
                System.out.print("Invaild choice!");
            }
        }
    }
}


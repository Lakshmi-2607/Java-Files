import java.util.Scanner;
public class ArrayStack{
    int[] s;
    int top=-1;
    public ArrayStack(int size){
        s=new int[size];
    }
    void push(int val){     
        if(top==s.length -1){
            System.out.println("Stack Overflow\n");
            return;
        }
        s[++top]=val;
        System.out.println(val+"Pushed to Stack.\n");
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow.\n");
            return;
        }
        System.out.println(s[top--]+"Popped\n");
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Elements in stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Stack size");
        ArrayStack s=new ArrayStack(sc.nextInt());
        while(true){
            System.out.println("1.push\n 2.pop\n 3.display\n 4.exit\n");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Value");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invaild choice! try again.\n");
            }
            
        }
    }
}
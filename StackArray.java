import java.util.*;
public class StackArray {
    public static void main(String[] arg) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println(s);
        System.out.println("Top of the Stack: " + s.peek());
        System.out.println(s);
        System.out.println("Popped  : " + s.pop());
        System.out.println(s);
        System.out.println("Popped  : " + s.pop());
        System.out.println(s);
        System.out.println("Pushing new element : Z");
        s.push("Z");
        System.out.println(s);
    }
}

import java.util.*;
public class Reverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String o=sc.nextLine();
        System.out.println("Original :"+o);
        Stack<Character> s=new Stack<>();
        StringBuilder reversed=new StringBuilder();
        for(int i=0; i<o.length(); i++){
            s.push(charAt(i));
            while(!s.Empty()){
                reversed.append(s.pop());
               
            }
        }
        System.out.println("Reversed :"+reversed.toString());
    }
}
import java.util.*;
public class LinearSearch{
    public static void main(String[]args){
        int i,s,f=0,n;
        int[] a=new int[50];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");

        n=sc.nextInt();
        System.out.println("Enter the value one by one");

        for(i=0; i<n; i++)
            a[i]=sc.nextInt();
            System.out.println("Enter the search element");
            s=sc.nextInt();
            
            for(i=0; i<n; i++){
                if(a[i]==s){
                    f=1;
                    break;
                }
            }
                if(f==1){
                    System.out.println("Element is found");
                }
                else{
                    System.out.println("Element is not found");
                }
            }
    }

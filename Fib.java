import java.util.*;
public class Fib{
    public static int fiba(int n,int arr[]){
        if(n==1||n==0)return n;
        if(arr[n]!=0){
            return arr[n];
        }
        arr[n] =fiba(n-1,arr)+fiba(n-2,arr);
        return arr[n];
    }
    public static int fibTab(int n ){
        int arr[]= new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for ( int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n+1];
        System.out.println(fiba(n, arr));
        System.out.println(fibTab(n));
        
    }
}
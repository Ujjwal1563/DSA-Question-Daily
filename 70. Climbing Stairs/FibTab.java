import java.util.*;
class FibTab{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n+1];
        Arrays.fill(arr,-1);
        arr[0]=1;
        for (int i=1;i<=n;i++){
            if(i==1){
                arr[i]=arr[i-1];
            }
            else{
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        System.out.println(arr[n]);
    }
}
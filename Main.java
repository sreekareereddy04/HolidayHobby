import java.util.*;

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n == 0){
            System.out.println("Invalid input");
        }
        else{
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
            int sum =0;
                for(int j = i; j < n; j++){
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
        }
    
}
}
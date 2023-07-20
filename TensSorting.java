import java.util.Scanner;
public class TensSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]  = sc.nextInt();
        }
        arr = findArr(arr, n);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    static int[] findArr(int[] arr,int n) {
        int k = 0,m = 0;
        for(int i=0;i<n;i++) {
            for(int j = i+1;j<n;j++) {
                k = arr[i]%100;
                k = k/10;
                m = arr[j]%100;
                m = m/10;
                if(k > m) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if(k == m) {
                    if(arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    
}
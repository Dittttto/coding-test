import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
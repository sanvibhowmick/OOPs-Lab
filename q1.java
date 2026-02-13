import java.util.Scanner;

public class q1 {

    public static int maxArea(int[] height, int n) {
        int l = 0;
        int r = n - 1;
        int maxi = 0;

        while (l < r) {
            int w = r - l;
            int mini = Math.min(height[l], height[r]);
            int area = w * mini;

            if (area > maxi) {
                maxi = area;
            }

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println(maxArea(height, n));
    }
}

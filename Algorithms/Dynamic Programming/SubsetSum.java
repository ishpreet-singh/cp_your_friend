/*
    Nitesh
    nitesh.cse14@nituk.ac.in
*/

import java.util.*;
import java.io.*;

class Solve {

    public Solve() {
        //do something
    }

    //recursive solution
    boolean isSubsetSum_recursive(int inp[], int n, int sum) {
        // base condition, if sum become zero than
        // we can say that do sum is possible for given sum
        if (sum == 0) return true;
        // if sum is greater than zero and do have elements
        if (n == 0 && sum != 0) return false;

        // ignore nth Number if number is greater than to sum
        if (inp[n - 1] > sum)
            return isSubsetSum_recursive(inp, n - 1, sum);

        // excluding and including nth index element
        return isSubsetSum_recursive(inp, n - 1, sum) ||
            isSubsetSum_recursive(inp, n - 1, sum - inp[n - 1]);
    }

    //dp solution
    boolean isSubsetSum_dp(int inp[], int n, int sum) {
        // initialise an array
        boolean dp[][] = new boolean[sum + 1][n + 1];

        // set true for sum zero
        for (int i = 0; i <= n; ++i)
            dp[0][i] = true;

        // set false from sum 1 to sum
        for (int i = 1; i <= sum; ++i)
            dp[i][0] = false;

        // check sum from 1 to sum is available or not
        for (int i = 1; i <= sum; ++i) {
            for (int j = 1; j <= n; ++j) {

                dp[i][j] = dp[i][j - 1];

                if (i >= inp[j - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - inp[j - 1]][j - 1];
                }
            }
        }

        return dp[sum][n];
    }
}

// Driver class

public class SubsetSum {
    public static void main(String []args) throws Exception {
        try {
            int n, sum;
            // Inputs using buffered reader
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            String str[] = (br.readLine()).toString().trim().split("\\s+");
            n = Integer.parseInt(str[0]);
            sum = Integer.parseInt(str[1]);

            int inp[] = new int[n];

            String str_inp[] = (br.readLine()).toString().trim().split("\\s+");
            for (int i = 0; i < n; ++i)
                inp[i] = Integer.parseInt(str_inp[i]);

            //class object initialisation

            Solve solve1 = new Solve();

            Solve solve2 = new Solve();

            //recursive solution output
            System.out.println(solve1.isSubsetSum_recursive(inp, n, sum) ? "True" : "False");

            //dp solution output
            System.out.println(solve2.isSubsetSum_dp(inp, n, sum) ? "True" : "False");

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Completed SubsetSum problem");
        }
    }
}
/*
    4 5
    1 2 3 4
    true
*/

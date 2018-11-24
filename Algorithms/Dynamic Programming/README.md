# Tutorial For Dynamic Programming Begginer to Advance

1.  [Introduction]()
2.  [Recursion and Dynamic Programming](https://www.quora.com/What-is-the-difference-between-dynamic-programming-and-recursion)
3.  [Longest Common Subsequence]()
4.  [Longest Increasing Subsequence]()
5.  [Some examples with solution]()





## Introduction

Dynamic programming (usually referred to as DP ) is a very powerful technique to solve a particular class of problems. Dynamic programming amounts to breaking down an optimization problem into simpler sub-problems, and storing the solution to each sub-problem so that each sub-problem is only solved once.

There are two ways of doing this.

### 1.) Top-Down :
Start solving the given problem by breaking it down. If you see that the problem has been solved already, then just return the saved answer. If it has not been solved, solve it and save the answer. This is usually easy to think of and very intuitive. This is referred to as Memoization.

### 2.) Bottom-Up :
Analyze the problem and see the order in which the sub-problems are solved and start solving from the trivial subproblem, up towards the given problem. In this process, it is guaranteed that the subproblems are solved before solving the problem. This is referred to as Dynamic Programming.


### Fibbonaci Series :
Let's try to understand this by taking an example of Fibonacci numbers.

    Fibonacci (n) = 1; if n = 0
    Fibonacci (n) = 1; if n = 1
    Fibonacci (n) = Fibonacci(n-1) + Fibonacci(n-2)

So, the first few numbers in this series will be: 1, 1, 2, 3, 5, 8, 13, 21... and so on!

A code for it using pure recursion:

```cpp
    int fib (int n) {
        if (n < 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
```

#### Using Dynamic Programming approach with memoization:
```cpp
    void fib () {
        fib_result[0] = 1;
        fib_result[1] = 1;
        for (int i = 2; i < n; ++i)
           fib_result[i] = fib_result[i - 1] + fib_result[i - 2];
    }
```
#### Space optimization:
```cpp
    int fib(int n) { 
      int a = 0, b = 1, c; 
      if( n == 0) 
        return a; 
      for (int i = 2; i <= n; i++) { 
         c = a + b; 
         a = b; 
         b = c; 
      } 
      return b; 
    } 
```

Using power of the matrix
[go for reference](https://math.stackexchange.com/questions/784710/how-to-prove-fibonacci-sequence-with-matrices)


## Longest Common Subsequence
Given two sequences, find the length of longest subsequence present in both of them.
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous

We are given two strings: string S of length n, and string T of length m. Our goal is to produce their longest
common subsequence: the longest sequence of characters that appear left-to-right (but not necessarily
in a contiguous block) in both strings.
For example, consider:

S = ABAZDC
T = BACBAD

In this case, the LCS has length 4 and is the string ABAD. Another way to look at it is we are finding
a 1-1 matching between some of the letters in S and some of the letters in T such that none of the
edges in the matching cross each other

#### producer :
let LCS[i,j] is the length of the LCS of S[1..i] with T[1..j]. How
can we solve for LCS[i,j] in terms of the LCS’s of the smaller problems?

<b>```Case 1:```</b>     what if S[i] 6= T[j]? Then, the desired subsequence has to ignore one of S[i] or T[j] so we
have:
LCS[i, j] = max(LCS[i − 1, j], LCS[i, j − 1]).

<b>```Case 2:```</b>     what if S[i] = T[j]? Then the LCS of S[1..i] and T[1..j] might as well match them up.
For instance, if I gave you a common subsequence that matched S[i] to an earlier location in
T, for instance, you could always match it to T[j] instead. So, in this case we have:
LCS[i, j] = 1 + LCS[i − 1, j − 1].


##### Computing the length of the LCS using Recursion (Time complexity <math>O(2^n)</math>)
The following function backtracks the choices taken when computing the C table. 
If the last characters in the prefixes are equal, they must be in an LCS. I
f not, check what gave the largest LCS of keeping S[j] and 
T[j], and make the same choice. Just choose one if they were equally long. 
Call the function with i = m and j = n.

```cpp
function backtrack(C[0..m,0..n], S[1..m], T[1..n], i, j)
    if i = 0 or j = 0
        return ""
    if  S[i] = T[j]
        return backtrack(C, S, T, i - 1, j - 1) + S[i]
    if C[i,j-1] > C[i-1,j]
        return backtrack(C, S, T, i, j - 1)
    return backtrack(C, S, T, i - 1, j)
```
##### Computing the length of the LCS using dynamic programming
The function below takes as input sequences <code>X[1..m]</code> and <code>Y[1..n]</code>, 
computes the LCS between <code>X[1..i]</code> and <code>Y[1..j]</code> for all <code>1 ≤ i ≤ m</code> and <code>1 ≤ j ≤ n</code>, and stores it in <code>C[i,j]</code>. <code>C[m,n]</code> will contain the length of the LCS of <code>X</code> and <code>Y</code>.

 ```c
 function LCSLength(X[1..m], Y[1..n])
      C = array(0..m, 0..n)
        for i := 0..m
            C[i,0] = 0
            for j := 0..n
                C[0,j] = 0
            for i := 1..m
                for j := 1..n
                    if X[i] = Y[j]
                        C[i,j] := C[i-1,j-1] + 1
                    else
                        C[i,j] := max(C[i,j-1], C[i-1,j])
      return C[m,n]
 ```
 ```text
     Time Complexity:  O(n^2)
     Space Complexity: O(n^2)
 ```
 
  #### Example
 Let <math>S</math> be <code>XMJYAUZ</code> and <math>T</math> be <code>MZJAWXU</code>.
 The longest common subsequence between <math>S</math> and <math>T</math> is <code>MJAU</code>.
 The table <code>C</code> shown below, which is generated by the function <code>LCSLength</code>, 
 shows the lengths of the longest common subsequences between prefixes of <math>S</math> and <math>T</math>. 
 The <math>i</math>th row and <math>j</math>th column shows the length of the LCS between <math>S_{1..i}</math> and <math>T_{1..j}</math>.
 
 |<p></p>|<p></p>|**0**|**1**|**2**|**3**|**4**|**5**|**6**|**7**|
 |:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
 |<p></p>|<p></p>|**Ø**|**M**|**Z**|**J**|**A**|**W**|**X**|**U**|
 |**0**|**Ø**|0|0|0|0|0|0|0|0|
 |**1**|**X**|&#8593;0|0|0|0|0|0|1|1|
 |**2**|**M**|0|&#8598;1|&#8592;1|1|1|1|1|1|
 |**3**|**J**|0|1|1|&#8598;2|2|2|2|2|
 |**4**|**Y**|0|1|1|&#8593;2|2|2|2|2|
 |**5**|**A**|0|1|1|2|&#8598;3|&#8592;3|&#8592;3|3|
 |**6**|**U**|0|1|1|2|3|3|3|&#8598;4|
 |**7**|**Z**|0|1|1|2|3|3|3|&#8593;4|
 The <span style="background: yellow">highlighted</span> numbers show the path the function 
 <code>backtrack</code> would follow from the bottom right to the top left corner, 
 when reading out an LCS. If the current symbols in <math>S</math> and <math>T</math> are equal, 
 they are part of the LCS, and we go both up and left. If not, we go up or left, 
 depending on which cell has a higher number. This corresponds to either taking the LCS between 
 <math>S_{1..i-1}</math> and <math>T_{1..j}</math>, or 
 <math>S_{1..i}</math> and <math>T_{1..j-1}</math>.
#### Related Longest Common Subsequence Problems
1.  [Longest Common Subsequence](https://www.codechef.com/problems/TLCS)
2.  [Longest Common Subsequence](https://www.codechef.com/problems/IFC03P02)
3.  [Longest Common Subsequence](https://www.hackerearth.com/problem/algorithm/longest-common-subsequence-2/)
4.  [Lucky Common Subsequence](https://codeforces.com/problemset/problem/346/B)
5.  [Chef and LCS](https://www.codechef.com/problems/CHEFKLCS)


## Longest Increasing Subsequence
Longest increasing subsequence problem is to find a subsequence of a given sequence in which 
the subsequence's elements are in sorted order, lowest to highest, and in which the 
subsequence is as long as possible. This subsequence is not necessarily contiguous, or unique.

#### Example

##### LIS using Brute force (Recursion Solution)
In this approach, we try to find all increasing subsequences and then returning the maximum 
length of longest increasing subsequence. In order to do this, we make use of a recursive 
function which returns the length of the LIS possible from the current element onwards
```cpp
int lengthOfLISUtil(int input[], int prev, int currPosition, int n) {
    if (curpos == n) {
        return 0;
    }
    int taken = 0;
    if (input[currPosition] > prev) {
        taken = 1 + lengthOfLISUtil(input, input[currPosition], currPosition + 1, n);
    }
    int notTaken = lengthOfLISUtil(input, prev, currPosition + 1, n);
    return max(taken, nottaken);
}

void lengthOfLIS(int input[]) {
    int n = sizeof(input) / sizeof(input[0]);
    int result = lengthofLIS(input, INT_MIN, 0, n);
    printf("Longest Increasing Subsequence Length: %d\n" result);
}
```
```text
    Time Complexity:  O(2^n)
    Space Complexity: O(n^2)
```

##### LIS using Brute force (Recursion Solution with memoization)
In the previous approach, many recursive calls had to made again and again with the same parameters.
This redundancy can be eliminated by storing the results obtained for a particular call in a
2-d memorization array dp. dp[i][j] represents the length of the LIS possible 
using input[i]] as the previous element considered to be included/not included in the LIS, Here, 
input represents the given array.

```cpp
public int lengthofLIS(int[] nums, int prevIndex, int currPosition, int[][] memo, int n) {
    if (currPosition == n) {
        return 0;
    }
    if (dp[prevIndex + 1][currPosition] >= 0) {
        return memo[previndex + 1][curpos];
    }
    int taken = 0;
    if (prevIndex < 0 || input[currPosition] > input[prevIndex]) {
        taken = 1 + lengthofLISUtil(input, currPosition, currPosition + 1, dp, n);
    }

    int notTaken = lengthofLIS(input, prevIndex, currPosition + 1, dp, n);
    dp[prevIndex + 1][currPosition] = max(taken, notTaken);
    return dp[prevIndex + 1][currPosition];
}

void lengthOfLIS(int input[]) {
    int n = sizeof(input) / sizeof(input[0]);
    int dp[n + 1][n];
    memset(dp, -1, sizeof dp);
    int result = lengthofLIS(input, INT_MIN, 0, dp, n);
    printf("Longest Increasing Subsequence Length: %d\n" result);
}
```
```text
    Time Complexity:  O(n^2)
    Space Complexity: O(n^2)
```

##### LIS using dynamic programming
Comming Soon
```text
    Time Complexity:  O(n^2)
    Space Complexity: O(n)
```
##### LIS using Binary Search
Comming Soon
```text
    Time Complexity:  O(nlog(n))
    Space Complexity: O(n)
```
##### LIS using Segment Tree
Comming Soon
```text
    Time Complexity:  O(nlog(n))
    Space Complexity: O(nlog(n))
```

#### Related Longest Increasing Subsequence Problems
5.  [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/description/)
5.  [Longest Increasing Subsequence](https://www.interviewbit.com/problems/longest-increasing-subsequence/)
5.  [Super Kth LIS](https://www.hackerrank.com/challenges/super-kth-lis/problem)
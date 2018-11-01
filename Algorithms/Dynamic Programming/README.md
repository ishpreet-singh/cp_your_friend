# Tutorial For Dynamic Programming Begginer to Advance

1.  [Introduction]()
2.  [Recursion and Dynamic Programming](https://www.quora.com/What-is-the-difference-between-dynamic-programming-and-recursion)
3.  [Some examples with solution]()





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
[click for full code link]()

Using Dynamic Programming approach with memoization:
```cpp
    void fib () {
        fib_result[0] = 1;
        fib_result[1] = 1;
        for (int i = 2; i < n; ++i)
           fib_result[i] = fib_result[i - 1] + fib_result[i - 2];
    }
```
[click for full code link]()

# Bit Manipulation

[Bit manipulation](https://en.wikipedia.org/wiki/Bit_manipulation) is the act of algorithmically manipulating bits or other pieces of data shorter than a word.

Working on bytes, or data types comprising of bytes like ints, floats, doubles or even data structures which stores large amount of bytes is normal for a programmer. In some cases, a programmer needs to go beyond this - that is to say that in a deeper level where the importance of bits is realized.

# Bitwise Opertors

At the heart of bit manipulation are the bit-wise operators & (and), | (or), ~ (not) and ^ (xor). 

Let **A** is **1010** and **B** is **1100**

* __NOT ( ~ )__: Bitwise NOT is an unary operator that flips the bits of the number i.e., if the ith bit is 0, it will change it to 1 and vice versa. Bitwise NOT is nothing but simply the one’s complement of a number. 
	> _~A = 0101_

* __AND ( & )__: Bitwise AND is a binary operator that operates on two equal-length bit patterns. If both bits in the compared position of the bit patterns are 1, the bit in the resulting bit pattern is 1, otherwise 0. 
	>_A&B = 1000_

* __OR ( | )__: Bitwise OR is also a binary operator that operates on two equal-length bit patterns, similar to bitwise AND. If both bits in the compared position of the bit patterns are 0, the bit in the resulting bit pattern is 0, otherwise 1. 
	>_A|B = 1110_

* __XOR ( ^ )__: Bitwise XOR also takes two equal-length bit patterns. If both bits in the compared position of the bit patterns are 0 or 1, the bit in the resulting bit pattern is 0, otherwise 1. 
	>_A^B = 0110_

* __Left Shift ( << )__: Left shift operator is a binary operator which shift the some number of bits, in the given bit pattern, to the left and append 0 at the end. Left shift is equivalent to multiplying the bit pattern with 2k ( if we are shifting k bits ).

	>1 << 1 = 2 = 21
	
	>1 << 2 = 4 = 22 
	
	>1 << 3 = 8 = 23
		
	>1 << 4 = 16 = 24 
	
	…
	
	>1 << n = 2n

* __Right Shift ( >> ):__ Right shift operator is a binary operator which shift the some number of bits, in the given bit pattern, to the right and append 1 at the end. Right shift is equivalent to dividing the bit pattern with 2k ( if we are shifting k bits ).

	>4 >> 1 = 2

	>6 >> 1 = 3

	>5 >> 1 = 2

	>16 >> 4 = 1

The Truth table is:

|**A**|**B**|**!A**|**A&&B**|**AIIB**|**A^B**|
|---|---|---|---|---|---|
|0|0|1|0|0|0|
|0|1|1|0|1|1|
|1|0|0|0|1|1|
|1|1|0|1|1|0|

# Bit Tactics

* Set Union: _A | B_
* Set intersection: _A & B_
* Set subtraction: _A & ~B_
* Set negation: _ALL_BITS ^ A_
* Set bit: _A |= 1 << bit_
* Clear bit: _A &= ~(1 << bit)_
* Test bit: _(A & 1 << bit) != 0_

# Frequently asked Bitwise Problems

* Compute XOR from 1 to N

	~~~~
	int computeXOR(int n)
	{
	    if (n % 4 == 0)
	        return n;
	    if (n % 4 == 1)
	        return 1;
	    if (n % 4 == 2)
	        return n + 1;
	    else
	        return 0;
	}
	~~~~

Refer [Compute XOR from 1 to N]() for more Info.

* Check if number is Power of Two
	
	~~~~
	bool isPowerOfTwo(int x)
	{
	    return x && (!(x & (x - 1)));
	}
	~~~~

* Count Number of leading, trailing zeros & number of 1’s in a binary code of an integer
>It can be done by using inbuilt function in C++
	

	Number of leading zeroes: builtin_clz(x)
	Number of trailing zeroes : builtin_ctz(x)
	Number of 1-bits: __builtin_popcount(x)  
	
* Generate all the possible subsets of a set

	~~~~
	void possibleSubsets(char A[], int N)
	{
	    for(int i = 0;i < (1 << N); ++i)
	    {
	        for(int j = 0;j < N;++j)
	            if(i & (1 << j))
	                cout << A[j] << ‘ ‘;
	        cout << endl;
		}
	}
	~~~~

# Practice Problems

* [Update It](http://www.spoj.com/problems/UPDATEIT/)
* [Squre Subsets](http://codeforces.com/problemset/problem/895/C)
* [Maximizing Xor](https://www.hackerrank.com/challenges/maximizing-xor/problem)
* [Subsets](https://leetcode.com/problems/subsets/description/)
* [Changing Bits](https://www.hackerrank.com/challenges/changing-bits/problem)
* [Counting Bit](https://leetcode.com/problems/counting-bits/description/)
* [LRU](http://codeforces.com/problemset/problem/698/C)
* [The great Xor](https://www.hackerrank.com/challenges/the-great-xor/problem)
* [Pebble](http://www.spoj.com/problems/PEBBLE/)
* [Two's Complement](https://www.hackerrank.com/challenges/2s-complement/problem)

# Usefull Resources

* [Bit Manipulation - TopCoder](https://www.topcoder.com/community/data-science/data-science-tutorials/a-bit-of-fun-fun-with-bits/)
* [Bit Manipulation - Geeksforgeeks](http://www.geeksforgeeks.org/bits-manipulation-important-tactics/)
* [Bit Manipulation - Wikipedia](https://en.wikipedia.org/wiki/Bit_manipulation)

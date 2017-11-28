# Binary Search

[Binary search](https://en.wikipedia.org/wiki/Binary_search_algorithm) is an efficient algorithm for finding an item from an ordered list of items.

`arr` is an array of length `N` and `item` is the element to search for.

	int binary_search(int arr[], int N, int item)
	{
		int low = 0, high = N-1, mid;
		while(low<=high)
		{
			mid=low+(high-low)/2;
			if(arr[mid]<item)
				low = mid+1;
			else if(arr[mid]>item)
				high = mid-1;
			else return mid;
		}
		return -1;		// Unsuccessful Search
	}

***Time Complexity***: O(Log<sub>2</sub>**N**)

# Practice Problems

* [Sherlock and Numbers](https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/sherlock-and-numbers/)
* [Right Triangle](https://www.codechef.com/problems/RIGHTTRI)
* [Stacks](https://www.codechef.com/problems/STACKS)
* [ABCDEF](http://www.spoj.com/problems/ABCDEF/)
* [Aggressive Cows](http://www.spoj.com/problems/AGGRCOW/)
* [Allocate Books](https://www.interviewbit.com/problems/allocate-books/)
* [Mortage](https://community.topcoder.com/stat?c=problem_statement&pm=2427&rd=4765)

# Binary Performance

The running time of Binary Search is **O(LogN)** as compare to **O(N)** in Linear search.
Here's a table showing the base-2 logarithms of various values of **N**: 

|N|lgN|
|------------|-----------|
|1|0|
|2|1|
|4|2|
|8|3|
|16|4|
|32|5|
|64|6|
|128|7|
|256|8|
|512|9|
|1024|10|
|1048576|20|


![alt text](https://github.com/ishpreet-singh/cp_your_friend/blob/master/Others/common/images/binary_search_vs_linear_search.png)

# Useful Resources:

* [Binary Search - Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search)
* [Binary Search - Wiki](https://en.wikipedia.org/wiki/Binary_search_algorithm)
* [Binary Search - TopCoder](https://www.topcoder.com/community/data-science/data-science-tutorials/binary-search/)
* [Binary Search - Codechef](https://www.codechef.com/wiki/tutorial-binary-search)
* [Binary Search - Tutorials Point](https://www.tutorialspoint.com/data_structures_algorithms/binary_search_algorithm.htm)
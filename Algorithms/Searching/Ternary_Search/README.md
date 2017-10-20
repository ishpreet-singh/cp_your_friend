# Ternary Search

Like *Linear search* and *Binary search*, [Ternary search](https://en.wikipedia.org/wiki/Ternary_search) is a searching technique that is used to determine the position of a specific value in an array. In binary search, the sorted array is divided into two parts while in ternary search, it is divided into 3 parts and then you determine in which part the element exists.

`arr` is an array of length `N` and `item` is the element to search for.

	int ternary_search(int arr[], int N, int item)
	{
		int start=0, end=N-1, mid1, mid2;
		if(end>=start)
		{
			mid1 = start + (end-start)/3;
			mid2 = end - (end-start)/3;
			if(arr[mid1] == item)
				return mid1+1;
			if(arr[mid2] == item)
				return mid2+1;
			if(arr[mid1] > item)
				return ternary_search(start, mid1-1, item);
			else if (arr[mid2] < item)
				return ternary_search(mid2+1, end, item);
			else
				return ternary_search(mid1+1, mid2-1, item);
		}
		return -1;	// Unsuccessful Search
	}

Ternary search, like binary search, is a divide-and-conquer algorithm. It is mandatory for the array (in which you will search for an element) to be sorted before you begin the search. In this search, after each iteration it neglects ⅓ part of the array and repeats the same operations on the remaining ⅔.

***Time Complexity***: O(Log<sub>3</sub>**N**)

# Practice Problems

* [Download File](https://www.hackerearth.com/practice/algorithms/searching/ternary-search/practice-problems/algorithm/download-file-b0fe3520/)
* [Puzzled Grid](https://www.hackerearth.com/practice/algorithms/searching/ternary-search/practice-problems/algorithm/puzzled-grid-1/)
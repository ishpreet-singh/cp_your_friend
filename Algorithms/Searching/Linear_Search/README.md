# Linear Search

[Linear search](https://en.wikipedia.org/wiki/Linear_search) is a simple search algorithm. In this type of search, a sequential search is made over all items one by one. Every item is checked and if a match is found then that particular item is returned, otherwise the search continues till the end of the data collection. We can use a flag like **-1** to represent unsuccessful search.

`arr` is an array of length `N` and `item` is the element to search for.

	int linear_search(int arr[], int N, int item)
	{
		for(int i=0;i<N;i++)
		{
			if(arr[i]==item)
				return i+1;			// successful Search
		}
		return -1;					// unsuccessful Search
	}

***Time Complexity***: `O(N)`

# Practice Problems

* [Monk takes a Walk](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/monk-takes-a-walk/)
* [Simple Search](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/simple-search-4/)
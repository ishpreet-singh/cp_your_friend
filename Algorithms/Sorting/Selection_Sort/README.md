# Selection Sort

[Selection Sort](https://en.wikipedia.org/wiki/Selection_sort) is a sorting algorithm that sorts an array by repeatedly finding the <b>minimum</b> element (considering ascending order) from unsorted part and putting it at the beginning.

`arr` is an array of length `N`

	int* selection_sort(int arr[], int N)
	{
		for(int i=0; i<N-1; i++)
		{
			int min_element_index=i;
			for(int j=i+1; j<N; j++)
			{
				if(arr[min_element_index] > arr[j])
					min_element_index = j;	
			}
			if(arr[i]>arr[min_element_index])	//Swap arr[i] with arr[min_element_index]
			{
				int temp = arr[min_element_index];
				arr[min_element_index]=arr[i];
				arr[i]=temp;
			}
		}
		return arr;
	}

# Implementation

Selection sort, sorts an array by repeatedly finding minimum element.  The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.

2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
<pre><code>arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning	
<b>11</b> 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 <b>12</b> 25 22 64
	
// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 <b>22</b> 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
11 12 22 <b>25</b> 64</code></pre>
	

# Example Video

[ ![Selection Sort](https://github.com/ishpreet-singh/cp_your_friend/blob/master/Others/common/images/bubble_sort.png) ](https://www.youtube.com/watch?v=GUDLRan2DWM)

# Time Complexity

*Best Case*: **O(N<sup>2</sup>)**

*Average Case*: **O(N<sup>2</sup>)**

*Worst Case*: **O(N<sup>2</sup>)**

# Practice Problems

* [Selection Sort](https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/practice-problems/algorithm/selection-sort-problem/)
* [Sticks](https://www.codechef.com/problems/STICKS)
* [Old Keypad](https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/practice-problems/algorithm/old-keypad-in-a-foreign-land-24/)

# Usefull Resources

* [Sorting - Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/sorting-algorithms/a/sorting)
* [Sorting - Vizualgo](https://visualgo.net/en/sorting)
* [Selection Sort - Geeksforgeeks](http://www.geeksforgeeks.org/selection-sort/)

# Merge Sort

[Merge Sort](https://en.wikipedia.org/wiki/Merge_sort) is a [divide-and-conquer](https://en.wikipedia.org/wiki/Divide_and_conquer_algorithm) algorithm based on the idea of breaking down a list into several sub-lists until each sublist consists of a single element and merging those sublists in a manner that results into a sorted list.

`arr` is an array of length `N`

	int arr2[10001];
	void Merge(int arr[], int start, int mid, int end)
	{
		int i=start, j=mid+1, k=start;
		while(i<=mid && j<=end)
		{
			if(arr[i]<arr[j])
				arr2[++k] = arr[++i];
			else arr2[++k] = arr[++j];
		}
		while(i<=mid)
			arr2[++k] = arr[++i];
		while(j<=end)
			arr2[++k] = arr[++j];
		i=start;
		while(i<=end)
			arr[i] = arr2[++i];
	}

	void Merge_Sort(int arr[], int start, int end)
	{
		if(start<end)
		{
			int mid = start + (end-start)/2;
			Merge_Sort(arr, start, mid);
			Merge_Sort(arr, mid+1, end);
			Merge(arr, start, mid, end);
		}
	}

# Implementation

**Concept:

* Divide the unsorted list into N sublists, each containing 1 element.
* Take adjacent pairs of two singleton lists and merge them to form a list of 2 elements. N will now convert into N/2 lists of size 2.
* Repeat the process till a single sorted list of obtained

![Merge Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/merge_sort.jpg)

As one may understand from the image above, at each step a list of size M is being divided into 2 sublists of size M/2, until no further division can be done. To understand better, consider a smaller array A containing the elements (9,7,8).

At the first step this list of size 3 is divided into 2 sublists the first consisting of elements (9,7) and the second one being (8). Now, the first list consisting of elements (9,7) is further divided into 2 sublists consisting of elements (9) and (7) respectively.

As no further breakdown of this list can be done, as each sublist consists of a maximum of 1 element, we now start to merge these lists. The 2 sub-lists formed in the last step are then merged together in sorted order using the procedure mentioned above leading to a new list (7,9). Backtracking further, we then need to merge the list consisting of element (8) too with this list, leading to the new sorted list (7,8,9)


# Example Video

[ ![Merge Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/bubble_sort.png) ](https://www.youtube.com/watch?v=TzeBrDU-JaY)


# Time Complexity

*Best Case*: **O(NLogN)**

*Average Case*: **O(NLogN)**

*Worst Case*: **O(NLogN)**

# Practice Problems

* [Chandu & his Girlfriend](https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/chandu-and-his-girlfriend/)
* [Merge Sort](http://www.spoj.com/problems/MERGSORT/)
* [Game of Strengths](https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/game-of-strengths-4/)
* [Merge Intervals](https://www.interviewbit.com/problems/merge-intervals/)
* [Inversion Count](http://www.spoj.com/problems/INVCNT/)

# Usefull Resources

* [Sorting - Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/merge-sort/a/divide-and-conquer-algorithms)
* [Merge Sort - Wiki](https://en.wikipedia.org/wiki/Merge_sort)
* [Sorting - Vizualgo](https://visualgo.net/en/sorting)
* [Merge Sort - Geeksforgeeks](http://www.geeksforgeeks.org/Merge-sort/)

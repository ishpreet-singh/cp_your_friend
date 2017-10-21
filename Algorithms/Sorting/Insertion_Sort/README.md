# Insertion Sort

[Insertion Sort](https://en.wikipedia.org/wiki/Insertion_sort) is based on the idea that one element from the input elements is consumed in each iteration to find its <b>correct position</b> i.e, the position to which it belongs in a sorted array.

`arr` is an array of length `N`

	int* Insertion_sort(int arr[], int N)
	{
		for(int i=0; i<N-1; i++)
		{
			int temp=arr[i], j=i;
			while(j>0 && temp<arr[j-1])
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		return arr;
	}

# Implementation

Insertion sort iterates the input elements by growing the sorted array at each iteration. It compares the current element with the <b>largest value</b> in the sorted array. 

If the current element is greater, then it leaves the element in its place and moves on to the next element else it finds its correct position in the sorted array and moves it to that position. This is done by shifting all the elements, which are larger than the current element, in the sorted array to one position ahead

Let **arr** be [**7,4,5,2**]

![Insertion_sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/insertion_sort.png)

# Example Video

[ ![Insertion Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/bubble_sort.png) ](https://www.youtube.com/watch?v=i-SKeOcBwko)

# Time Complexity

*Best Case*: **O(N)**

*Average Case*: **O(N<sup>2</sup>)**

*Worst Case*: **O(N<sup>2</sup>)**

# Practice Problems

* [Monk and Nice Strings](https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/algorithm/monk-and-nice-strings-3/)
* [Sticks](https://www.codechef.com/problems/STICKS)
* [Insertion Sort Part 1](https://www.hackerrank.com/challenges/insertionsort1/problem)
* [Insertion Sort Part 2](https://www.hackerrank.com/challenges/insertionsort2/problem)

# Usefull Resources

* [Sorting - Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort)
* [Sorting - Vizualgo](https://visualgo.net/en/sorting)
* [Insertion Sort - Geeksforgeeks](http://www.geeksforgeeks.org/Insertion-sort/)

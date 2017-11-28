# Bubble Sort

[Bubble Sort](https://en.wikipedia.org/wiki/Bubble_sort) is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

`arr` is an array of length `N`

	int* bubble_sort(int arr[], int N)
	{
		for(int i=0; i<N-1; i++)
		{
			for(int j=0; j<N-i-1; j++)
			{
				if(arr[j]>arr[j+1])	//Swap arr[j] with arr[j+1]
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

# Implementation

Let us take the array of numbers " **5 1 4 2 8** ", and sort the array from lowest number to greatest number using bubble sort. In each step, elements written in bold are being compared. Three passes will be required.

***First Pass***

( __5 1__ 4 2 8 ) -> ( __1 5__ 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.

( 1 __5 4__ 2 8 ) -> ( 1 __4 5__ 2 8 ), Swap since 5 > 4

( 1 4 __5 2__ 8 ) -> ( 1 4 __2 5__ 8 ), Swap since 5 > 2

( 1 4 2 __5 8__ ) -> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

***Second Pass***

( __1 4__ 2 5 8 ) -> ( 1 4 2 5 8 )

( 1 __4 2__ 5 8 ) -> ( 1 __2 4__ 5 8 ), Swap since 4 > 2

( 1 2 __4 5__ 8 ) -> ( 1 2 4 5 8 )

( 1 2 4 __5 8__ ) -> ( 1 2 4 5 8 )

Now, the array is already sorted, but the algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

***Third Pass***

( __1 2__ 4 5 8 ) -> ( 1 2 4 5 8 )

( 1 __2 4__ 5 8 ) -> ( 1 2 4 5 8 )

( 1 2 __4 5__ 8 ) -> ( 1 2 4 5 8 )

( 1 2 4 __5 8__ ) -> ( 1 2 4 5 8 )

# Example Video

[ ![Bubble Sort](https://github.com/ishpreet-singh/cp_your_friend/blob/master/Others/common/images/bubble_sort.png) ](https://www.youtube.com/watch?v=Jdtq5uKz-w4)


# Time Complexity

*Best Case*: **O(N)**

*Average Case*: **O(N<sup>2</sup>)**

*Worst Case*: **O(N<sup>2</sup>)**


# Practice Problems

* [The Best Player](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/the-best-player-1/)
* [Sticks](https://www.codechef.com/problems/STICKS)
* [Max Min Difference](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/min-max-difference/)

# Usefull Resources

* [Sorting - Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/sorting-algorithms/a/sorting)
* [Sorting - Vizualgo](https://visualgo.net/en/sorting)
* [Bubble Sort - Geeksforgeeks](http://www.geeksforgeeks.org/bubble-sort/)

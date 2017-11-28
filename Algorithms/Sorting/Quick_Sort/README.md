# Quick Sort

[Quick sort](https://en.wikipedia.org/wiki/Quicksort) is based on the [divide-and-conquer](https://en.wikipedia.org/wiki/Divide_and_conquer_algorithm) approach based on the idea of choosing one element as a pivot element and partitioning the array around it such that: Left side of pivot contains all the elements that are less than the pivot element Right side contains all elements greater than the pivot

It reduces the space complexity and removes the use of the auxiliary array that is used in merge sort. Selecting a random pivot in an array results in an improved time complexity in most of the cases.

`arr` is an array with `start` is leftmost position & `end` is the rightmost position of the array

	int partition ( int arr[], int start, int end) {
	    int i = start + 1;
	    int piv = arr[start];            //make the first element as pivot element.
	    for(int j = start + 1; j <= end; j++ )  {
	    /*rearrange the array by putting elements which are less than pivot
	       on one side and which are greater that on other. */

	          if ( arr[j] < piv) {
	                 swap (arr[i],arr[j]);
	            i += 1;
	        }
	   }
	   swap ( arr[start] ,arr[i-1] );  //put the pivot element in its proper place.
	   return i-1;                      //return the position of the pivot
	}

	void quick_sort ( int arr[], int start, int end ) {
	   if( start < end ) {
	        //stores the position of pivot element
	         int piv_pos = partition (arr, start, end);     
	         quick_sort (arr,start , piv_pos -1);    //sorts the left side of pivot.
	         quick_sort (arr, piv_pos +1 , end); //sorts the right side of pivot.
	   }
	}

# Implementation

![Merge Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/quick_sort.jpg)

You have an array `A=[9,7,8,3,2,1]` Observe in the diagram above, that the **randpartition()** function chooses pivot randomly as 7 and then swaps it with the first element of the array and then the **partition()** function call takes place, which divides the array into two halves. The first half has elements less than 7 and the other half has elements greater than 7. 

For elements less than 7, in 5th call, **randpartition()** function chooses 2 as pivot element randomly and then swap it with first element and call to the **partition()** function takes place. After the 7th and 8th call, no further calls can take place as only one element left in both the calls. Similarly, you can observe the order of calls for the elements greater than 7.

Let’s see the randomized version of the partition function :
	
	int rand_partition ( int A[ ] , int start , int end ) {
	    //chooses position of pivot randomly by using rand() function .
	     int random = start + rand( )%(end-start +1 ) ;

	      swap ( A[random] , A[start]) ;        //swap pivot with 1st element.
	     return partition(A,start ,end) ;       //call the above partition function
	}

# Example Video

[ ![Merge Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/bubble_sort.png) ](https://www.youtube.com/watch?v=COk73cpQbFQ)

# Time Complexity

*Best Case*: **O(N<sup>2</sup>)**

*Average Case*: **O(NLogN)**

*Worst Case*: **O(NLogN)**

# Practice Problems

* [Sort me this way](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/practice-problems/algorithm/fredo-and-absolute-sorting-24/)
* [One Sized Game](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/practice-problems/algorithm/one-sized-game/)
* [KSMALL](http://www.spoj.com/problems/KSMALL/)
* [Quicksort2](https://www.hackerrank.com/challenges/quicksort2/problem)

# Usefull Resources

* [Sorting - Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/merge-sort/a/divide-and-conquer-algorithms)
* [Quick Sort - Wiki](https://en.wikipedia.org/wiki/Quicksort)
* [Sorting - Vizualgo](https://visualgo.net/en/sorting)
* [Quick Sort - Geeksforgeeks](http://www.geeksforgeeks.org/quick-sort/)

# Heap Sort

[Heap sort](https://en.wikipedia.org/wiki/Heapsort) is a comparison based sorting technique based on [Binary Heap](http://www.geeksforgeeks.org/binary-heap/) data structure. It is similar to [selection sort](https://github.com/ishpreet-singh/cp_your_friend/tree/master/Algorithms/Sorting/Selection_Sort) where we first find the maximum element and place the maximum element at the end. We repeat the same process for remaining element.

Consider an array `Arr` of length `N` which is to be sorted using Heap Sort.

	void max_heapify (int Arr[ ], int i, int N)
	{
	    int left = 2*i                   //left child
	    int right = 2*i +1           //right child
	    if(left<= N and Arr[left] > Arr[i] )
	          largest = left;
	    else
	         largest = i;
	    if(right <= N and Arr[right] > Arr[largest] )
	        largest = right;
	    if(largest != i )
	    {
	        swap (Ar[i] , Arr[largest]);
	        max_heapify (Arr, largest,N);
	    } 
	 }

	void build_maxheap (int Arr[ ], int N)
	{
	    for(int i = N/2 ; i >= 1 ; i-- )
	    {
	        max_heapify (Arr, i, N) ;
	    }
	}

	void heap_sort(int Arr[ ], int N)
    {
        int heap_size = N;

        build_maxheap(Arr, N);
        for(int i = N; i >= 2 ; i-- )
        {
            swap|(Arr[ 1 ], Arr[ i ]);
            heap_size = heap_size - 1;
            max_heapify(Arr, 1, heap_size);
        }
    }

# Implementation

* Initially build a max heap of elements in Arr.
* The root element, that is Arr[1], will contain maximum element of Arr. After that, swap this element with the last element of Arr and heapify the max heap excluding the last element which is already in its correct position and then decrease the length of heap by one.
* Repeat the step 2, until all the elements are in their correct position.


In the diagram below,initially there is an unsorted array Arr having 6 elements and then max-heap will be built.

![Heap Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/heap_sort_implementation.jpg)

After building max-heap, the elements in the array Arr will be:

![Heap Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/heap_sort_initial_array.jpg)

* **Step 1**: 8 is swapped with 5.
* **Step 2**: 8 is disconnected from heap as 8 is in correct position now and.
* **Step 3**: Max-heap is created and 7 is swapped with 3.
* **Step 4**: 7 is disconnected from heap.
* **Step 5**: Max heap is created and 5 is swapped with 1.
* **Step 6**: 5 is disconnected from heap.
* **Step 7**: Max heap is created and 4 is swapped with 3.
* **Step 8**: 4 is disconnected from heap.
* **Step 9**: Max heap is created and 3 is swapped with 1.
* **Step 10**: 3 is disconnected.

![Heap Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/heap_sort_explaination.jpg)

After all the steps, we will get a sorted array.

![Heap Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/heap_sort_final_array.jpg)

# Example Video

[ ![Heap Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/bubble_sort.png) ](https://www.youtube.com/watch?v=PqS5T9ZKZno)

# Time Complexity

*Best Case*: **O(NLogN)**

*Average Case*: **O(N)**

*Worst Case*: **O(NLogN)**

# Practice Problems

* [Sort me this way](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/practice-problems/algorithm/fredo-and-absolute-sorting-24/)
* [Divide Apples](https://www.hackerearth.com/es/practice/algorithms/sorting/heap-sort/practice-problems/algorithm/divide-apples/)
* [KSMALL](http://www.spoj.com/problems/KSMALL/)

# Usefull Resources

* [Heap Sort - Wiki](https://en.wikipedia.org/wiki/Heapsort)
* [Sorting - Vizualgo](https://visualgo.net/en/sorting)
* [Heap Sort - Geeksforgeeks](http://www.geeksforgeeks.org/heap-sort/)

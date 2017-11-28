# Counting Sort

[Counting Sort](https://en.wikipedia.org/wiki/Counting_sort) is an algorithm for sorting a collection of objects according to keys that are small integers; that is, it is an integer sorting algorithm. 

In Counting sort, the frequencies of distinct elements of the array to be sorted is counted and stored in an auxiliary array, by mapping its value as an index of the auxiliary array.

`Arr` is an array of length `N`

	void counting_sort(int Arr[], int N) {

	    // First, find the maximum value in Arr[]
	    int K = 0;
	    for(int i=0; i<N; i++)
	        K = max(K, Arr[i]);

	    // Initialize the elements of Aux[] with 0
	    int Aux[K+1];
	    for(int i=0 ; i<=K; i++)
	        Aux[i] = 0;

	    // Store the frequencies of each distinct element of Arr[],
	    // by mapping its value as the index of Aux[] array
	    for(int i=0; i<N; i++) 
	        Aux[Arr[i]]++;

	    int j = 0;
	    for(int i=0; i<=K; i++) {
	        int tmp = Aux[i];
	        // Update Arr
	        while(tmp--)
	            Arr[j++] = i;
	    }
	}


# Implementation

Let's assume that, array Arr of size N needs to be sorted.

* Initialize the auxillary array Aux[] as 0. 
**Note**: The size of this array should be ≥max(A[]).
* Traverse array Arr and store the count of occurrence of each element in the appropriate index of the Aux array, which means, execute Aux[Arr[i]]++ for each i, where i ranges from [0,N−1].
* Traverse array Aux and copy i into Arr for Aux[i] number of times where 0≤i≤max(Arr[]).

Note: The array Arr can be sorted by using this algorithm only if the maximum value in array Arr is less than the maximum size of the array Aux. Usually, it is possible to allocate memory up to the order of a million (10<sup>6</sup>). If the maximum value of Arr exceeds the maximum memory- allocation size, it is recommended that you do not use this algorithm. Use either the [quick sort](https://github.com/ishpreet-singh/cp_your_friend/tree/master/Algorithms/Sorting/Quick_Sort) or [merge sort](https://github.com/ishpreet-singh/cp_your_friend/tree/master/Algorithms/Sorting/Merge_Sort) algorithm.

# Example

Say **Arr={5,2,9,5,2,3,5}**. Aux will be of the size **9+1** i.e. **10**. **Aux={0,0,2,1,0,3,0,0,0,2}**. Notice that **Aux[2]=2** which represents the number of occurrences of **2** in Arr[]. Similarly **Aux[5]=3** which represents the number occurrences of **5** in Arr[].

After applying the counting sort algorithm, Arr[] will be **{2,2,3,5,5,5,9}**

# Example Video

[ ![Counting Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/bubble_sort.png) ](https://www.youtube.com/watch?v=TTnvXY82dtM)


# Time Complexity

*Best Case*: **O(N+K)**

*Average Case*: **O(N+K)**

*Worst Case*: **O(N+K)**


# Practice Problems

* [Shill & Birthday Presents](https://www.hackerearth.com/ja/practice/algorithms/sorting/counting-sort/practice-problems/algorithm/shil-and-birthday-present/)
* [SORT](https://www.codechef.com/problems/SORT)
* [Counting Sort 1](https://www.hackerrank.com/challenges/countingsort1/problem)

# Usefull Resources

* [Sorting - Vizualgo](https://visualgo.net/en/sorting)
* [Counting Sort - Geeksforgeeks](http://www.geeksforgeeks.org/counting-sort/)
* [Counting Sort - Wikipedia](https://en.wikipedia.org/wiki/Counting_sort)

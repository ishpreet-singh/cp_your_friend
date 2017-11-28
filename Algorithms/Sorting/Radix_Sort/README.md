# Radix Sort

[Radix Sort](https://en.wikipedia.org/wiki/Radix_sort) is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys by the individual digits which share the same significant position and value 

In Radix sort, the algorithm is For each digit i where i varies from the least significant digit to the most significant digit of a number, Sort input array using countsort algorithm according to ith digit.

`arr` is an array of length `n`

	void countsort(int arr[],int n,int place)
	{
	        int i,freq[range]={0};         //range for integers is 10 as digits range from 0-9
	        int output[n];
	        for(i=0;i<n;i++)
	                freq[(arr[i]/place)%range]++;
	        for(i=1;i<range;i++)
	                freq[i]+=freq[i-1];
	        for(i=n-1;i>=0;i--)
	        {
	                output[freq[(arr[i]/place)%range]-1]=arr[i];
	                freq[(arr[i]/place)%range]--;
	        }
	        for(i=0;i<n;i++)
	                arr[i]=output[i];
	}
	void radixsort(ll arr[],int n,int maxx)            //maxx is the maximum element in the array
	{
	        int mul=1;
	        while(maxx)
	        {
	                countsort(arr,n,mul);
	                mul*=10;
	                maxx/=10;
	        }
	}


# Implementation

Let's assume that, array arr of size n needs to be sorted.

* Let arr = { 170, 45, 75, 90, 802, 24, 2, 66 }

* Sorting by least significant digit (1s place) gives: [Notice that we keep 802 before 2, because 802 occurred before 2 in the original list, and similarly for pairs 170 & 90 and 45 & 75.]

	17**0**, 9**0**, 80**2**, **2**, 2**4**, 4**5**, 7**5**, 6**6**

* Sorting by next digit (10s place) gives: [Notice that 802 again comes before 2 as 802 comes before 2 in the previous list.]

	8**0**2,2, **2**4, **4**5, **6**6, 1**7**0, **7**5, **9**0

* Sorting by most significant digit (100s place) gives:

	2, 24, 45, 66, 75, 90, **1**70, **8**02

# Example Video

[ ![Radix Sort](https://github.com/ishpreet-singh/Project_X/blob/master/Others/common/images/bubble_sort.png) ](https://www.youtube.com/watch?v=YXFI4osELGU)


# Time Complexity

Time Complexity: **O((N+B) * Log<sub>B</sub>(K))** where,

* **B** is the base, for decimal system, B is 10

* **N** is the number of elements to be sorted

* **K** is the maximum possible value

Read more about [Radix Sort Time Complexity](http://www.geeksforgeeks.org/radix-sort/).

# Practice Problems

* [Monk & Sorting Algorithm](https://www.hackerearth.com/ja/practice/algorithms/sorting/radix-sort/practice-problems/algorithm/monk-and-sorting-algorithm/)
* [Radix Sort](https://www.codechef.com/problems/RDX)
* [Lexisort](http://www.spoj.com/problems/LEXISORT/)

# Usefull Resources

* [Sorting - Vizualgo](https://visualgo.net/en/sorting)
* [Radix Sort - Geeksforgeeks](http://www.geeksforgeeks.org/radix-sort/)
* [Radix Sort - Wikipedia](https://en.wikipedia.org/wiki/Radix_sort)

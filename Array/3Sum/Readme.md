# 3 Sum

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:
```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```
Example 2:
```
Input: nums = []
Output: []
```
Example 3:
```
Input: nums = [0]
Output: []
 ```

Constraints:
```
0 <= nums.length <= 3000
-105 <= nums[i] <= 105
```

[Leetcode](https://leetcode.com/problems/3sum/)

Submission Stats:
```
Runtime: 487 ms, faster than 16.36% of Java online submissions for 3Sum.
Memory Usage: 43.4 MB, less than 34.01% of Java online submissions for 3Sum.
```

Time Complexity: `O(n^2)` <- 1 loop for i, second while loop to find j & k
Space Complexity: `O(n)` <- For the Set

Improvements:
- Ignore duplicate values (i != i-1) instead of using a Set
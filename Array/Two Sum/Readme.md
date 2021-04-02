# Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```
Example 2:
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```
Example 3:
```
Input: nums = [3,3], target = 6
Output: [0,1]
 ```

Constraints:
```
2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
```
Only one valid answer exists.

## Intuition:

We check all the pairs and see if any of them result in given Target

Time complexity: `O(n^2)`
Space complexity: `O(1)`

### Dynamic Programming:

1. Create HashMap to store element as the key and index as the value
2. Iterate over each element
3. Check if `target - this value` exists in hashmap - return ans if exists
4. else, add this element to Hashmap

### Submission stats
```
Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum.
Memory Usage: 39.3 MB, less than 26.95% of Java online submissions for Two Sum.
```
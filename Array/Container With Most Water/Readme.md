# Container With Most Water

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

 

Example 1:

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
```
Example 2:
```
Input: height = [1,1]
Output: 1
```
Example 3:
```
Input: height = [4,3,2,1,4]
Output: 16
```
Example 4:
```
Input: height = [1,2,1]
Output: 2
 ```

Constraints:
```
n == height.length
2 <= n <= 105
0 <= height[i] <= 104
```

## Intuition:
Container with the max rectangular area fits the most water. To calculate the area, we do 
```
area = length * breadth;
area = min(height[i], height[j]) * (j - i) where j > i
```

we check the area of all container, this would take `O(n^2)`

Using 2 pointer technique, we could optimize this

**Approach:**
1. We assume `max_area = 0`
2. We point left pointer to index 0 and right pointer to last index
3. We calculate the area, if this area is more than `max_area` we assign this value to `max_value`
4. Since we need max area, we decrease right pointer if `height[right] < height[left]` else increase left
5. Remoce until `left < right`

Time Complexity: `O(n)`
Space Complexity: `O(1)`

Submission stats:
```
Runtime: 2 ms, faster than 93.09% of Java online submissions for Container With Most Water.
Memory Usage: 49.3 MB, less than 33.78% of Java online submissions for Container With Most Water.
```
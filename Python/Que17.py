# Given a sorted array of unique integers `arr[]` and an inclusive range [lower, upper],
# find the smallest list of sorted non-overlapping ranges that cover all missing numbers
# in the interval [lower, upper] but are not present in `arr[]`.
# Each missing number must be covered exactly once, and no number from `arr[]` should be in the output ranges.

# Example 1:
# Input: arr = [14, 15, 20, 30, 31, 45], lower = 10, upper = 50
# Output: [[10, 13], [16, 19], [21, 29], [32, 44], [46, 50]]

# Example 2:
# Input: arr = [-48, -10, -6, -4, 0, 4, 17], lower = -54, upper = 17
# Output: [[-54, -49], [-47, -11], [-9, -7], [-5, -5], [1, 3], [5, 16]]

if __name__ == '__main__':
    arr = list(map(int, input().split()))
    lower = int(input())
    upper = int(input())
    result = []
    arr= [lower-1] + arr + [upper+1]
    for i in range(1, len(arr)):
        prev = arr[i - 1]
        curr = arr[i]
        
        if curr > (prev+1):
            result.append([prev+1, curr-1])

    print(result)
        
        
    
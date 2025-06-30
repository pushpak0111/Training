# arr[] -> given 
# input [1, 2, 3, 4, 5, 6, 7, 8] k = 3
# output = [3, 2, 1, 6, 5, 4, 8, 7]

if __name__ ==  '__main__':
    x = input()
    arr = x.split()
    k = int(input())
    for i in range(0, len(arr), k):
        left = i
        right = min( (i+k)-1, len(arr)-1)
        while(left < right):
            temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            left+= 1
            right -= 1
    print(arr)
# Rotate the elements in Array
def main():
    x  = input() # Entering array elements with spaces
    arr = x.split()
    n = int(input()) # number of rotations

    for _ in range(n):
        val = arr.pop(0)
        arr.append(val)
    print(arr)
    #  print(arr[n:] + arr[:n]) # 2nd Solution
    
if __name__ == '__main__':
    main()
# Program to print the Diamond Shape
if __name__ == '__main__':
    n = int(input()) # n = 5
    for i in range(1, n+1):
        print(" " * (n-i) + "*" *((2*i) -1) )
    for j in range(n, 0, -1):
        print(" " * (n-j) + "*" * ((2*j)-1))
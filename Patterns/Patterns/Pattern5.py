# Program to Print Full Pyramid Pattern (Star Pattern)
if __name__ == '__main__':
    n = int(input()) # n = 5
    for i in range(1, n):
        print(" " * (n-i) + "*" * ((2*i)-1) +" " * (n-i)) 
    
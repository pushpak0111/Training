# Program to Print Left Half Pyramid Pattern (Star Pattern)
if __name__ == '__main__':
    n = int(input()) # n = 5
    for i in range(1, n+1):
        print(" "*(n-i) + "*" * i) 
    
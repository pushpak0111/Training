#Inverted Pyramid
if __name__ == '__main__':
    n = int(input()) # n = 5
    for i in range(n, 0, -1):
        print(" " * (n-i) + "*" * ((2*i)-1) + " " * (n-i)) 
    
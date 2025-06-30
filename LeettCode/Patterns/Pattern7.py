# Half Diamond Star
if __name__ == '__main__':
    n = int(input()) # n = 5
    for i in range(1, n+1):
        print("*" *i)
    for j in range(n-1, 0, -1):
        print("*"*j)
        
    
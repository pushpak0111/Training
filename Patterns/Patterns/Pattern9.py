# Pattern to print A 
if __name__ == '__main__':
    n = int(input("Enter the number of lines: "))
    for i in range(1, n+1):
        for j in range(1, n+1):
            print("*",end= " ") 
        print()
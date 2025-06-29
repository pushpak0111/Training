# Butterfly pattern
def main():    
    n = int(input("Enter the number of rows: "))

    for i in range(1, n + 1):
        print("*" * i + " " * (2 * (n - i)) + "*" * i)
        
    for i in range(n-1, 0, -1):
        print("*" * i + " " * (2 * (n - i)) + "*" * i)   
        
if __name__ == '__main__':
    main()
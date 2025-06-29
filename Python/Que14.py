#Diamond 
def diamond(n):
    for i in range(n):
        print(" " * (n - i - 1) + "*" * (2 * i + 1))
    for i in range(n - 2, -1, -1):
        print(" " * (n - i - 1) + "*" * (2 * i + 1))
def main():
    n = int(input("Enter the number of rows: "))
    diamond(n)     
if __name__ == '__main__':  
    main() 
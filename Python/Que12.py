# pyramid
def main():
    n = int(input())
    for i in range(1, n+1):
        print(" " * (n - i) + "*" * (2 * i - 1))
if __name__ == '__main__':
    main()
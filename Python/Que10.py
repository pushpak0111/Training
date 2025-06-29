# reversed right angle triangle
# This code prints a right angle triangle in reverse order.
def main():
    n = int(input())
    for i in range(n, 0, -1):
        print("*" * i)
        i = i * 1
if __name__ == '__main__':
    main()
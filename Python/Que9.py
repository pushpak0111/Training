# right angle triangle
# This code prints a right angle triangle.
# It prints a triangle with the number of rows specified by the user.
def main():
    n = int(input())
    for i in range(1, n + 1):
        print("*" * i)
        i = i * 1
if __name__ == '__main__':
    main()
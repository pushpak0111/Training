def main():
    X = int(input("Enter X: "))
    Y = int(input("Enter Y: "))
    Output = X * Y

    if Output >= 1 and Output <= 12:
        print(Output)
    elif Output < 0:
        print("Invalid")
    elif Output >= 13 and Output <= 24:
        print(Output - 12)
    elif Output > 24:
        print("Invalid")

if __name__ == '__main__':
    main()

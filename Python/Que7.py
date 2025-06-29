# def main():
#     N = input()
#     result = ""
#     if N.isalpha() == True:
#         print("Invalid")

#     for i in N:
#         if i == '0':
#             result += '5'
#         else:
#             result += i  
            
#     print(result)
# if __name__ == '__main__':
#     main()


# without using list, array, strings and functions
def main():
    N = int(input())
    result = 0
    mul = 1
    while N != 0:
        rem = N % 10
        if rem == 0:
            rem = 5
        result =  rem * mul + result
        mul *= 10
        N = N // 10
            
    print(result)
if __name__ == '__main__':
    main()
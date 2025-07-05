# Reverse the string without any function
def reverse_string(s):
    reversed_str = ""
    for i in range(len(s) - 1, -1, -1):
        reversed_str += s[i]
    return reversed_str     

if __name__ == '__main__':
    s = input("Enter a string: ")
    result = reverse_string(s)
    print("Reversed string:", result)

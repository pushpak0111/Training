# num = 123 output = 321 reverse without any loop and function

def main():
    num = 654   
    a = ((num % 10) * 100) 
    b = (((num // 10) % 10) * 10)
    c = (num // 100)
    print (a+b+c)
if __name__ == '__main__':
    main()
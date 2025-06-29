# N km long race and contribute dollar for every even num km they complete 
# return sum of all even numbered km

def main():
    N = int(input())
    sum = 0
    
    for i in range(1, N+1):
        if i % 2 == 0:
            sum+=i
    print(sum) 

if __name__ == '__main__':
    main()
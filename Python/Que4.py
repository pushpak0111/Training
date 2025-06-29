def main():
    month = int(input("Enter month(1-12): "))
    year = int(input("Enter year: "))
    
    if year%4 == 0:
        if month == 2:
            print('29')
        elif month == 11 or month == 4 or month == 6 or month == 9:
            print('30')
        elif month <= 0 or month > 12:
            print('Invalid') 
        else:
            print('31')
    else:
        if month == 2:
            print('28')
        elif month == 4 or month == 6 or month == 9 or month == 11:
            print('30')
        elif month <= 0 or month > 12:
            print('Invalid') 
        else:
            print('31')
    
if __name__ == '__main__':
    main()
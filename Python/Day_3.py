# Given a +ve integer check the integer is having single digit or double digit or more than that
def Count_Digit():
    Num = input("Enter a Number to check : ")
    if isinstance(Num, int):
        Num_str = str(Num)
        Length = len(Num_str)
        if(len == 1):
            print("Number", Num, "is Single Digit")
        elif(len == 2):
            print("Number", Num, "is Double Digit")
        elif(len == 3):
            print("Number", Num, "is Triple Digit")
        else:
            print("The number having more than 3 digits")
    else:
        print("Enter a Valid Integer")

def main():
    Count_Digit()


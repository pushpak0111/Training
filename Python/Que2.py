#Rahmat has a ball. He wants to find the balls rebound height which he dropped fro height H and initial velocity , 
#after the Nth rebound final velocity of ball be Vn. Your task  is to help him find and return and integer value representing the height to which ball rebound after 
#n bounces.

def main():
    H = int(input("Enter the Initial heigth of the Ball: "))
    V = int(input("Enter the Initial Velocity of the Ball: "))
    Vn = int(input("Enter the Final velovity of the Ball: "))
    
    En = V/Vn
    RH = (H*En*En)
    
    print(RH)
    
if __name__ == '__main__':
    main()
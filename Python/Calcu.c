# include<stdio.h>
int main(){
    int a , b;
    printf("Enter 2 Numbers : ");
    scanf ("%d%d", &a, &b);
    
    int i;
    printf("Choose the Operation : \n1 for Addition \n2 for Substraction \n3 for Multiplication \n4 for Division");
    scanf("%d", &i);
    
    switch(i){
        case 1:
        printf("%d", a+b);
        break;
        
        case 2:
        printf("%d", a-b);
        break;
        
        case 3:
        printf("%d", a*b);
        break;
        
        case 4:
        printf("%d", a/b);
        break;
        
        default:
        printf("Invalid");
    }
}
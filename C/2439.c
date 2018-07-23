#include <stdio.h>
// Problem Number : 2439
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램. 
int main() {
    int n,i,j;
    scanf("%d", &n);
    for(i=1; i<=n; i++){
       for(j=n-i; j>0; j--)
           printf(" ");
    	for(j=0; j<i; j++)
             printf("*");
        printf("\n");
    } 
}

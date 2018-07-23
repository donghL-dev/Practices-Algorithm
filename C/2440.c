#include <stdio.h>
// Problem Number : 2440
// 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ....., N번쨰 줄에는 별 1개를 찍는 프로그램. 
int main() {
    int n,i,j;
    scanf("%d", &n);
    for(i=n; i>0; i--) {
     for(j=0; j<i; j++)
        printf("*");
     printf("\n");
 	}
}

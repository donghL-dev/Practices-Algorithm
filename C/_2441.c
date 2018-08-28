#include <stdio.h>
// Problem Number : 2441
// 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 프로그램 
int main() {
	int n,i,j;
    scanf("%d", &n);
    for(i=1; i<=n; i++){
     for(j=1; j<i; j++)
        printf(" ");
     for(j=n; j>=i; j--)
        printf("*");
     printf("\n");
 	}
}

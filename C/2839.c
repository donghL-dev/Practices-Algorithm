#include <stdio.h>
int main()
// Problem Number : 2839
// Problem Address : https://www.acmicpc.net/problem/2839
{
    int n;
    scanf("%d", &n);
    if(n==4 || n==7) {
        printf("-1\n");
        return 0;
    }
    
    if(n%5==0) 
		printf("%d", n/5);
    else if(n%5%2==1) 
		printf("%d\n", n/5+1);
    else 
		printf("%d", n/5+2);
}

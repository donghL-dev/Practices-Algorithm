#include <stdio.h>
int main()
// Problem Number : 10430
// Problem Address : https://www.acmicpc.net/problem/10430
{
 	int a,b,c;
 	scanf("%d %d %d", &a, &b, &c);
 	printf("%d\n%d\n%d\n%d", (a+b)%c, (a%c+b%c)%c, (a*b)%c, (a%c*b%c)%c);
}


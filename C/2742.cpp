#include<stdio.h>
// Problem Number : 2742
// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램
int main() 
{
	int i,n;
	scanf("%d", &n);
	for(i=0; i<n; i++)
		printf("%d\n", n-i);
}



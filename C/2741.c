#include<stdio.h>
// Problem Number : 2741
// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램
int main() 
{
	int n, i;
	scanf("%d", &n);
	for(i=1; i<=n; i++)
  		printf("%d\n", i);
}

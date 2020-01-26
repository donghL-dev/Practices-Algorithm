#include<stdio.h>
// Probelm Number : 8393
// N이 주어졌을 때, 1부터 N까지 합을 구하는 프로그램.
int main() {
	int n, sum=0;
	scanf("%d", &n);
	
 	for(int i=1; i<=n; i++) {
  		sum += i;
	}
	printf("%d", sum);
}

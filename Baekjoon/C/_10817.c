#include<stdio.h>
// Problem Number : 10817
// 세 정수 A, B, C가 주어진다.  이 때, 두 번째로 큰 정수를 출력하는 프로그램
int main() {
	int a,b,c;
	scanf("%d %d %d", &a, &b,  &c);

	if((b<=a && a<=c) || (c<=a && a<=b))
		printf("%d\n", a);
	else if((a<=b && b<=c) || (c<=b && b<=a))
		printf("%d\n", b);
	else
		printf("%d\n", c);
}

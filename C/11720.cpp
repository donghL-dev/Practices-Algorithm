#include<stdio.h>
// Problem Number : 11720
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램.
int main() {
	int n, sum=0;
	scanf("%d", &n);
	char s[100];
	
	scanf("%s", &s);

	for(int i=0; i<n; i++){
		sum += s[i] - 48;
	}
	
	printf("%d", sum);
}



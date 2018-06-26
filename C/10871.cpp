#include<stdio.h>
// Probelm Number : 10871
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
// 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램.
int main() {
	int n,x,tmp;
	scanf("%d %d", &n, &x);

	for(int i=0; i<n; i++) {
    	scanf("%d", &tmp);
    	if(tmp<x) {
    		printf("%d ", tmp);
    	}
  	}
}

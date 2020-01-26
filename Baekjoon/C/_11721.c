#include<stdio.h>
#include<string.h>
// Problem Number : 11721
// 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
// 한 줄에 10글자씩 끊어서 출력하는 프로그램.
int main() {
	char s[101];
	int i,j;
	
	scanf("%s", s);
	j = strlen(s);

	for(i=0; i<j; i++) {
		printf("%c", s[i]);
		if((i+1)%10 == 0)
			printf("\n");
	}
}

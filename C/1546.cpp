#include<stdio.h>
// Problem Number : 1546
// 세준이는 기말고사를 망쳤다.  세준이는 점수를 조작해서 집에 가져가기로 했다.
// 세준이는 자기 점수 중에 최대값을 골랐다. 이 값을 M이라고 한다.
// 모든 점수를 점수/M*100이 되어 71.43점이 된다.
// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램.
int main() {
	int n;
	scanf("%d", &n);

	int max = 0;
	float sum = 0.0;
	int score[1000] = {0, };
	
	for(int i=0; i<n; i++) {
		scanf("%d", &score[i]);
		if(max<score[i])
			max=score[i];
	}
	
	for(int i=0; i<n;  i++)
		sum += ((float)score[i]/(float)max)*100;
		
	printf("%.2lf", sum/(float)n);'
}



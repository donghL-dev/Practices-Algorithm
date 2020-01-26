#include<stdio.h>
// Probelm Number : 1924 
// 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램
int main() {
	int month[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    char day[7][4] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    int count = 0;
    int x,y;
    
    scanf("%d %d", &x, &y);

 	for(int i=0; i<x; i++) {

 		if(i+1==x) {
  	 		count += y;
		} else
			count += month[i];
	}

 	printf("%s", day[count%7]);
 	return 0;
}



#include<stdio.h>
// Problem Number : 4334
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
// 당신은 그들에게 슬픈 진실을 알려줘야 한다.  
int main() {
  int score[1000];
  double average[1000];
  int n;

  scanf("%d", &n);

  for(int i = 0; i<n; i++) {
      int sum = 0;
      int average1 = 0;
      int sum1 = 0;
      int c;

      scanf("%d", &c);
      for(int j=0; j<c; j++) {
           scanf("%d", &score[j]);
      }
      for(int k=0; k<c; k++) {
          sum += score[k];
      }
      average1 = sum / c;
      for(int m=0; m<c; m++) {
          if(score[m]>average1)
            sum++;
       }
       average[i] = ((double)sum1 / (double)c)*100;
}

	for(int i=0; i<n; i++)
		printf("%.3lf%%\n", average[i]);

}

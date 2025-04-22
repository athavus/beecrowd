#include <stdio.h>

int main() {

  double a;
  double b;

  scanf("%lf %lf", &a, &b);

  a = a * 3.5;
  b = b * 7.5;

  double media = (a + b) / 11;

  printf("MEDIA = %.5lf\n", media);

  return 0;
}
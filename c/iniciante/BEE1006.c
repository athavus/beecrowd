#include <stdio.h>

int main() {
  double a, b, c;

  scanf("%lf %lf %lf", &a, &b, &c);

  a = a * 2.0;
  b = b * 3.0;
  c = c * 5.0;
  
  double media = (a + b + c) / 10.0;

  printf(("MEDIA = %.1lf\n"), media);

  return 0;
}
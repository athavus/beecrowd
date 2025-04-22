#include <stdio.h>

int main() {
  int numero, horas;
  double salario;

  scanf("%d %d %lf", &numero, &horas, &salario);

  printf("NUMBER = %d\n", numero);
  printf("SALARY = U$ %.2lf\n", horas * salario);

  return 0;
}
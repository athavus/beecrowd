#include <stdio.h>

int main() {
  int codigo_peca1, codigo_peca2, numero_de_pecas1, numero_de_pecas2;
  double valor_peca1, valor_peca2;

  scanf("%d %d %lf", &codigo_peca1, &numero_de_pecas1, &valor_peca1);
  scanf("%d %d %lf", &codigo_peca2, &numero_de_pecas2, &valor_peca2);

  double total = (numero_de_pecas1 * valor_peca1) + (numero_de_pecas2 * valor_peca2);

  printf("VALOR A PAGAR: R$ %.2lf\n", total);

  return 0;
}
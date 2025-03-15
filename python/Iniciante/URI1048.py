n = float(input())

if n >= 0 and n <= 400.0:
  reajuste = 0.15
elif n > 400.0 and n <= 800.0:
  reajuste = 0.12
elif n > 800.0 and n <= 1200.0:
  reajuste = 0.1
elif n > 1200.0 and n <= 2000.0:
  reajuste = 0.07
else:
  reajuste = 0.04

novo_salario = n + (n * reajuste)

print(f"Novo salario: {novo_salario:.2f}")
print(f"Reajuste ganho: {n * reajuste:.2f}")
print(f"Em percentual: {reajuste * 100:.0f} %")
from math import sqrt

linha = input().split()

a, b, c = list(map(float, linha))

if a == 0 or b * b - 4 * a * c < 0:
  print("Impossivel calcular")
else:
  bascara = sqrt(b * b - 4 * a * c)
  r1 = ((b*-1) + bascara) / (2 * a)
  r2 = ((b*-1) - bascara) / (2 * a)

  print(f"R1 = {r1:.5f}")
  print(f"R2 = {r2:.5f}")
linha = input().split()
a, b, c = list(map(float, linha))

if ((a < b + c) and (b < a + c) and (c < b + a)):
  perimetro = a + b + c;
  print(f"Perimetro = {perimetro:.1f}");
else:
  area = (a + b) * c / 2
  print(f"Area = {area:.1f}")
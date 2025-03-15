a, b, c = map(float, input().split())

if b > a and b > c:
  start = a
  a = b
  b = start
elif c > a:
  start = a
  a = c
  c = start

if a >= (b + c):
  print("NAO FORMA TRIANGULO")
else:
  if (a * a) == (b * b) + (c * c):
    print("TRIANGULO RETANGULO")
  elif (a * a) > (b * b) + (c * c):
    print("TRIANGULO OBTUSANGULO")
  elif (a * a) < (b * b) * (c * c):
    print("TRIANGULO ACUTANGULO")

  if a == b and a == c:
    print("TRIANGULO EQUILATERO")
  elif ((a == b and a != c) or (a == c and a != b) or (b == c and a != b)):
    print("TRIANGULO ISOSCELES")

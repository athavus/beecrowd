from math import sqrt, ceil

while True:
  n = input()
  if n == "0":
    break

  a, b, c = map(int, n.split())
  
  area = a * b
  
  c = c / 100

  nova_area = area / c

  nova_area = int(sqrt(nova_area))
  
  print(nova_area)
  
n = []

for i in range(0, 20):
  n.append(int(input()))

aux = 0
inverso = 19

for i in range(0, 10):
  aux = n[i]
  n[i] = n[inverso]
  n[inverso] = aux
  inverso -= 1

for i in range(0, 20):
  print(f"N[{i}] = {n[i]}")
n = int(input())

vetor = []

cont = 0

while True:
  for c in range(0, n):
    vetor.append(c)
  cont += n
  
  if cont >= 1000:
    break

for j in range(0, 1000):
  print(f"N[{j}] = {vetor[j]}")

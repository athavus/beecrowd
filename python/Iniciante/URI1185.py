operacao = str(input())

a = []
b = []

total = 0

for c in range(12): 
  for i in range(12):
    b.append(float(input()))
  a.append(b)
  b = []

cont = 0
contador_linha = 0

for linha in range(11, -1, -1):
  for coluna in range(contador_linha):
    total += a[linha][coluna]
    cont += 1
  contador_linha += 1

if operacao == "S":
  print(f"{total:.1f}")
elif operacao == "M":
  print(f"{total / cont:.1f}")

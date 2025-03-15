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

for linha in range(11, -1, -1):
  for coluna in range(-1, (linha * -1) - 1, -1):
    total += a[linha][coluna]
    cont += 1

if operacao == "S":
  print(f"{total:.1f}")
elif operacao == "M":
  print(f"{total / cont:.1f}")

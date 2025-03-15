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
aux = -1

for linha in range(12):
    if linha >= 1 and linha <= 5:
      for coluna in range(linha):
        total += a[linha][aux]
        aux -= 1
        cont += 1
      aux = -1

    elif linha >= 6 and linha <= 10:
      for coluna in range(11 - linha):
        total += a[linha][aux]
        aux -= 1
        cont += 1
      aux = -1

if operacao == "S":
  print(f"{total:.1f}")
elif operacao == "M":
  print(f"{total / cont:.1f}")

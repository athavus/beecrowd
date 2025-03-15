operacao = str(input())

a = []
b = []

total = 0

for c in range(12): 
  for i in range(12):
    b.append(float(input()))
  a.append(b)
  b = []

limite_esquerdo = 1
limite_direito = 10

for i in range(5):  
    for c in range(limite_esquerdo, limite_direito + 1):
        total += a[i][c]
    limite_esquerdo += 1
    limite_direito -= 1

if operacao == "S":
  print(f"{total:.1f}")
elif operacao == "M":
  print(f"{total / 30:.1f}")

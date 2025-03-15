while True:
  n = int(input())

  if n == 0:
    break

  for i in range(1, n + 1):
    linha = []
    for j in range(1, n + 1):
        valor = abs(i - j) + 1
        linha.append(str(valor))
    print(" ".join(linha))
try:
  while True:
    maior = 0
    corridas = int(input())

    linha = input().split()

    for valor in linha:
      if maior < int(valor):
        maior = int(valor)

    if maior < 10:
      print(1)
    elif maior >= 10 and maior < 20:
      print(2)
    else:
      print(3)

except EOFError:
  pass
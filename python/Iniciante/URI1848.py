cont = 0
soma = 0

while True:
  corvo = str(input())

  if corvo == "caw caw":
    print(soma)
    soma = 0
    cont += 1
    if cont == 3:
      break
  else:
    corvo = corvo.replace("*", "1").replace("-", "0")
    
    corvo_binario = int(corvo, 2)
    
    soma += corvo_binario
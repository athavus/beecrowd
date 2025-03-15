frase = "LIFE IS NOT A PROBLEM TO BE SOLVED"

letras = int(input())

if letras < 35:  
  cont = 0

  for letra in frase:
    print(letra, end="")
    cont += 1
    if cont == letras:
      break
print()
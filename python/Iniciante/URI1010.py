linha1 = input().split(' ')
linha2 = input().split(' ')

codigo1, numero1, valor1 = linha1
codigo2, numero2, valor2 = linha2

total = (int(numero1) * float(valor1)) + (int(numero2) * float(valor2))

print(f'VALOR A PAGAR: R$ {total:.2f}')
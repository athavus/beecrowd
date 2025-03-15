linha = input().split()
codigo, quantidade = list(map(int, linha))

precos = [4.00, 4.50, 5.00, 2.00, 1.50]

print(f"Total: R$ {(precos[codigo - 1] * quantidade):.2f}")
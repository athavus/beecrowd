n = int(input())

anos = n // 365
n -= anos * 365

meses = n // 30
n -= meses * 30

print(f"{anos:.0f} ano(s)\n{meses:.0f} mes(es)\n{n:.0f} dia(s)")
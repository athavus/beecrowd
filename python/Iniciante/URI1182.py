num = int(input())

char = str(input())

soma = 0

for i in range(0, 144):
  valor = float(input())
  
  if i == num:
    soma += valor
    num += 12
  
if char == 'M':
  print(f"{soma / 12:.1f}")
  exit()
  
print(f"{soma:.1f}")
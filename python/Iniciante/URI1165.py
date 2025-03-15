n_casos = int(input())

for i in range(0, n_casos):
  num = int(input())
  divisores = 0
  
  for i in range(2, num):
    if num % i == 0:
      divisores += 1
  
  if divisores == 0:
    print(f"{num} eh primo")
  else:
    print(f"{num} nao eh primo")
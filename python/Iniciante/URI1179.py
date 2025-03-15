impar = []
par = []

for i in range(0, 15):
  x = int(input())

  if x % 2 == 0:
    if len(par) == 5:
      for i in range(0, len(par)):
        print(f"par[{i}] = {par[i]}")
      par.clear()
      
    par.append(x)
  elif x % 2 != 0:
    if len(impar) == 5:
      for i in range(0, len(impar)):
        print(f"impar[{i}] = {impar[i]}")
      impar.clear()
    
    impar.append(x)

for i in range(0, len(impar)):
  print(f"impar[{i}] = {impar[i]}")

for i in range(0, len(par)):
  print(f"par[{i}] = {par[i]}")
      
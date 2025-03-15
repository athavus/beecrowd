x = []

for i in range(1, 11):
  num = int(input())

  if num <= 0:
    num = 1
  
  x.append(num)

for i in range(0, len(x)):
  print(f"X[{i}] = {x[i]}")
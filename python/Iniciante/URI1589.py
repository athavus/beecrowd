n = int(input())

for i in range(n):
  linha = input().split()
  x, y = list(map(int, linha))

  print(x + y)

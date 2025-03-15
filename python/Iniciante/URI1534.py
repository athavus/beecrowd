try:
  while True:
    n = int(input())

    cont = 1

    a = []
    b = []

    diagonal_esq = 0
    diagonal_dir = n - 1

    total = 0

    for c in range(n):
      for i in range(n):
        if i == diagonal_dir:
          b.append(2)
          diagonal_dir -= 1
        elif i == diagonal_esq:
          b.append(1)
        else:
          b.append(3)
      diagonal_esq += 1
      a.append(b)
      b = []

    for i in range(n):
      for c in range(n):
        if c == n - 1:
          print(a[i][c])
        else:
          print(f"{a[i][c]}", end="")
          
except EOFError:
  pass
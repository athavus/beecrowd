while True:
  n = int(input())

  if n == 0:
    break
  max_num = 2 ** (2 * (n - 1))
  width = len(str(max_num))
  
  aux = 1
  for c in range(1, n + 1):
    if c >= 2:
      print()
    cont = aux
    for i in range(n):
      print(f"{str(cont).rjust(width)}", end=" ")
      cont *= 2
    aux *= 2
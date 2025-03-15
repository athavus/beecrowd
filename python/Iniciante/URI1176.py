num = int(input())

for i in range(0, num):
  n = int(input())

  if n == 0:
    print("Fib(0) = 0")
  elif n == 1:
    print("Fib(1) = 1")
  else:
    ant = 0
    prox = 1
    aux = 0

    for c in range(2, n + 1):
      aux = prox
      prox = ant + prox
      ant = aux

    print(f"Fib({n}) = {prox}")
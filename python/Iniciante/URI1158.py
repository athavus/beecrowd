n = int(input())

for i in range(0, n):
    linha = input().split()
    x, y = list(map(int, linha))
    soma = 0

    if x % 2 == 0:
        x += 1

    for i in range(x, (x + (y * 2)), 2):
        soma += i

    print(soma)

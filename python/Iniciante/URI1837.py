linha = input().strip().split()

x, y = map(int, linha)

for r in range(abs(y)):
    if ((x - r) % y) == 0:
        q = int((x - r) / y)
        break

print(q, r)
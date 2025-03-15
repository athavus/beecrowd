s = 1

denominador = 2

for i in range(3, 39, 2):
    s += i / denominador
    denominador *= 2

print(f"{s:.2f}")

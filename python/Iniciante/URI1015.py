from math import sqrt

linha_1 = input().split()
x1, y1 = list(map(float, linha_1))

linha_2 = input().split()
x2, y2 = list(map(float, linha_2))

distancia = sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

print(f"{distancia:.4f}")
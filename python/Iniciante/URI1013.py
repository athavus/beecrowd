valor = input().split(" ")
a, b, c = valor
maiorab = (int(a) + int(b) + abs(int(a) - int(b))) / 2
maior = (int(maiorab) + int(c) + abs(int(maiorab) - int(c))) / 2
print(f'{maior:.0f} eh o maior')

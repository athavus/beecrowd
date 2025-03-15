idades = []

total = 0

while True:
    idade = int(input())

    if idade < 0:
        break
    idades.append(idade)

for i in idades:
    total += i

print(f"{total/len(idades):.2f}")

nota_100, nota_50, nota_20, nota_10, nota_5, nota_2, nota_1 = 0, 0, 0, 0, 0, 0, 0

n = int(input())

n_inicial = n

nota_100 = n // 100
n = n % 100

nota_50 = n // 50
n = n % 50

nota_20 = n // 20
n = n % 20

nota_10 = n // 10
n = n % 10

nota_5 = n // 5
n = n % 5

nota_2 = n // 2
n = n % 2

nota_1 = n

print(f"{n_inicial}\n{nota_100} nota(s) de R$ 100,00\n{nota_50} nota(s) de R$ 50,00\n{nota_20} nota(s) de R$ 20,00\n{nota_10} nota(s) de R$ 10,00\n{nota_5} nota(s) de R$ 5,00\n{nota_2} nota(s) de R$ 2,00\n{nota_1} nota(s) de R$ 1,00")
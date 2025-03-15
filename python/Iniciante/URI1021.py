nota_100, nota_50, nota_20, nota_10, nota_5, nota_2 = 0, 0, 0, 0, 0, 0
moeda_100, moeda_50, moeda_25, moeda_10, moeda_5, moeda_1 = 0, 0, 0, 0, 0, 0

n = float(input())

centavos_de_n = (n - int(n)) * 100

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

moeda_100 = int(n)

moeda_50 = centavos_de_n // 50
centavos_de_n = centavos_de_n % 50

moeda_25 = centavos_de_n // 25
centavos_de_n = centavos_de_n % 25

moeda_10 = centavos_de_n // 10
centavos_de_n = centavos_de_n % 10

moeda_5 = centavos_de_n // 5
centavos_de_n = centavos_de_n % 5

moeda_1 = centavos_de_n // 1
centavos_de_n = centavos_de_n % 1

print(f"NOTAS:\n{nota_100:.0f} nota(s) de R$ 100.00\n{nota_50:.0f} nota(s) de R$ 50.00\n{nota_20:.0f} nota(s) de R$ 20.00\n{nota_10:.0f} nota(s) de R$ 10.00\n{nota_5:.0f} nota(s) de R$ 5.00\n{nota_2:.0f} nota(s) de R$ 2.00")

print(f"MOEDAS:\n{moeda_100:.0f} moeda(s) de R$ 1.00\n{moeda_50:.0f} moeda(s) de R$ 0.50\n{moeda_25:.0f} moeda(s) de R$ 0.25\n{moeda_10:.0f} moeda(s) de R$ 0.10\n{moeda_5:.0f} moeda(s) de R$ 0.05\n{moeda_1:.0f} moeda(s) de R$ 0.01")
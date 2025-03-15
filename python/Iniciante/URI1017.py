tempo = int(input())
velocidade = int(input())

total_percorrido = tempo * velocidade
total_litros = total_percorrido / 12

print(f'{total_litros:.3f}')
n = int(input())

horas = n // 3600
n -= horas * 3600

minutos = n // 60
n -= minutos * 60

print(f"{horas:.0f}:{minutos:.0f}:{n:.0f}")
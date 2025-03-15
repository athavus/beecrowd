pessoas = int(input())

linha = list(map(int, input().split()))

print(linha.index(min(linha)) + 1)
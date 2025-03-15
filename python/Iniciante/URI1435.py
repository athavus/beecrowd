while True:
    N = int(input())
    
    if N == 0:
        break  

    matriz = [[0] * N for _ in range(N)]
    
    for i in range(N):
        for j in range(N):
            matriz[i][j] = 1 + min(i, j, N - 1 - i, N - 1 - j)

    for linha in matriz:
        print(" ".join(f"{valor:3}" for valor in linha))
    
    print()

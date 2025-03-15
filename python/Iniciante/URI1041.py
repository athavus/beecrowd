linha = input().split()
x, y = list(map(float, linha))

if (x == 0 and y == 0):
    print("Origem")
elif (x == 0):
    print("Eixo Y")
elif (y == 0):
    print("Eixo X")
elif (y > 0 and x > 0):
    print("Q1")
elif (y > 0 and x < 0):
    print("Q2")
elif (y < 0 and x < 0):
    print("Q3")
elif (y < 0 and x > 0):
    print("Q4")
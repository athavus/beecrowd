h_inicial, h_final = map(int, input().split())

if h_inicial > h_final:
  print(f"O JOGO DUROU {24 - (h_inicial - h_final)} HORA(S)")
elif h_final > h_inicial:
  print(f"O JOGO DUROU {h_final - h_inicial} HORA(S)")
else:
  print("O JOGO DUROU 24 HORA(S)")
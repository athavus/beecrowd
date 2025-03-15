jogos = int(input())

for jogo in range(jogos):
  linha = input().split()
  sheldon, raj = list(map(str, linha))

  if (sheldon == "tesoura" and raj == "papel") or (sheldon == "papel" and raj == "pedra") or (sheldon == "pedra" and raj == "lagarto") or (sheldon == "lagarto" and raj == "Spock") or (sheldon == "Spock" and raj == "tesoura") or (sheldon == "tesoura" and raj == "lagarto") or (sheldon == "lagarto" and raj == "papel") or (sheldon == "papel" and raj == "Spock") or (sheldon == "Spock" and raj == "pedra") or (sheldon == "pedra" and raj == "tesoura"):
    print(f"Caso #{jogo + 1}: Bazinga!")
  elif  (raj == "tesoura" and sheldon == "papel") or (raj == "papel" and sheldon == "pedra") or (raj == "pedra" and sheldon == "lagarto") or (raj == "lagarto" and sheldon == "Spock") or (raj == "Spock" and sheldon == "tesoura") or (raj == "tesoura" and sheldon == "lagarto") or (raj == "lagarto" and sheldon == "papel") or (raj == "papel" and sheldon == "Spock") or (raj == "Spock" and sheldon == "pedra") or (raj == "pedra" and sheldon == "tesoura"):
    print(f"Caso #{jogo + 1}: Raj trapaceou!")
  else:
    print(f"Caso #{jogo + 1}: De novo!")
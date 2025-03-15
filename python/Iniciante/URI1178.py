x = float(input())

vetor = [x]

for i in range(1, 100):
	vetor.append(x / 2)
	x /= 2
	
for i in range(0, len(vetor)):
	print(f"N[{i}] = {vetor[i]:.4f}")

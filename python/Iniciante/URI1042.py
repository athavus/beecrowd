linha = input().split()
nums = list(map(int, linha))

original_nums = nums.copy()
nums.sort()

for i in nums:
  print(i)
print()
for c in original_nums:
  print(c)
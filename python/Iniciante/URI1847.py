A, B, C = map(int, input().split())

if (A > B) and (B <= C):
    print(":)")
elif (A < B) and (B >= C):
    print(":(")
elif (A < B) and (B < C) and (C - B < B - A):
    print(":(")
elif (A < B) and (B < C) and (C - B >= B - A):
    print(":)")
elif (A > B) and (B > C) and (B - C < A - B):
    print(":)")
elif (A > B) and (B > C) and (B - C >= A - B):
    print(":(")
elif (A == B) and (B < C):
    print(":)")
elif (A == B) and (B >= C):
    print(":(")

n = int(input())
res = 0
for i in range(n):
    a,b = input().split()
    res += float(a) * float(b)
print("%.3f" % res)
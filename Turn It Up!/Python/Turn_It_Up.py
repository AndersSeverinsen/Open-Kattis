n=int(input())
res = 7
for n in range(n):
    if input()=="Skru op!":
        if res<10:
            res+=1
    else:
        if res>0:
            res-=1
print(res)
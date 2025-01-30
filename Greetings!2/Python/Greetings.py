inp=input()
ee = False
num_e = 0
res=""
k=0
for i in range(len(inp)):
    if ee:
        if inp[i]=="e":
            num_e+=1
        else:
            res = inp[k:i]+"e"*num_e
            k=i
            ee = False
    else:
        if inp[i]=="e":
            ee = True
            num_e+=1
res+=inp[k:len(inp)]
print(res)
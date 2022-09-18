import keyword
# print(keyword.kwlist)
kwlist = keyword.kwlist
for i in range(0,len(kwlist)):
    print("[{:10}]".format(kwlist[i]), end=" ")
    if (i+1)%5==0: print()

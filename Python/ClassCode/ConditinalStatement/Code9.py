x=int(input("value for x:"))
y=int (input("Value for y:"))
for i in range(x,y+1):
        if i%2==0:
            print("{} is even".format(i))
        else:
            print(i,"is odd")

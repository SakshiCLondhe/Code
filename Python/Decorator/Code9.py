def normalfun(**args):
    sumdata=0
    for k,v in args.items():
        sumdata=sumdata+v
    return sumdata
print(normalfun(x=10,y=20,z=30))

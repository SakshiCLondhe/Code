def decorfun(func):
    print("in decor fun")
    def wrapper(*args):
        print(" start wrapper-2")
        func(*args)
        print(" End wrapper-2")
    return wrapper
def normalfun(x,y):
    print(" in normal fun")
    return x+y
normalfun=decorfun(normalfun)
print(normalfun(10,20))

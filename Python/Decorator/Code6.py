def decorfun(func):
    def wrapper():
        print(" start wrapper")
        func()
        print(" End Wrapper")
    return wrapper
def normalFun():
    print(" In normal fun")
normalFun=decorfun(normalFun)
normalFun()

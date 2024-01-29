def decorfun(func):
    print(" in decor fun")
    def wrapper():
        print(" start wrapper-1")
        func()
        print("end wrapper-1")
    return wrapper
def decorRun(func):
    print("  in decor Run")
    def wrapper():
        print(" start wrapper-2")
        func()
        print(" end wrapper-2")
    return wrapper
#@decorfun
#@decorRun
def normalfun():
    print("  in normal")
normalfun=decorfun(decorRun(normalfun))
normalfun()



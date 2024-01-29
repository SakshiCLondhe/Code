def decorfun(func):
    def wrapper():
        print("Start Wrapper")
        func()
        print("End Wrapper")
    return wrapper
@decorfun
def normalfun():
    print("Hello in normal fun")
normalfun()

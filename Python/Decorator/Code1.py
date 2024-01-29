def outerfun():
    print(" in outer fun")
    def innerfun():
        print("in inner fun")
    return innerfun
outerfun()

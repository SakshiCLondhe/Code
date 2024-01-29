def outer():
    print ("u are in outer ")
    def inner():
         print(" u are in inner")
    return inner
ret=outer()
print(ret)

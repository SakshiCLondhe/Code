def outer():
    def inner():
        return "hello"
    return inner()
ret=outer()
print(ret)

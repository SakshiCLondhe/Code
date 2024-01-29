class Demo:
    def __init__(self):
        self.x=10
        self._y=20
        self.__z=30
    def __fun(self):
        print("fun function")

print(dir(Demo))
print("===============================================================================================================")
obj=Demo()
print(dir(obj))
print("===============================================================================================================")
print(obj.x)
print(obj._y)
print(obj._Demo__z)
obj._Demo__fun()


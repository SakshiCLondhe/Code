# using id we can check the  obj are equal or not
class Demo:
    def fun(self):
        print(" In Demo: fUN")
class Memo:
    def gun(self):
        print(" In Memo :gun")
def callfun(obj):
    if(id(obj)==id(obj1)):
        print(id(obj1))
        print(id(obj))
        obj.fun()
    elif(id(obj)==id(obj2)):
        print(id(obj2))
        print(id(obj))
        obj.gun()
obj1=Demo()
obj2=Memo()
callfun(obj2)

class Demo:
    def fun(self):
        print(" In Demo : fun")
class Memo:
    def fun(self):
        print(" In memo : fun")
def callfun(obj): # polymorphism 
    obj.fun()
obj1=Demo()
obj2=Memo()
callfun(obj2)

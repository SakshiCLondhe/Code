#another method for checking address of object
class Demo:
        def fun(self):
            print(" In Demo: Fun")
class Memo:
        def gun(self):
            print(" In Memo : gun")
def callfun(obj):
        if hasattr(obj,'fun'):
            obj.fun()
        elif hasattr(obj,'gun'):
            obj.gun()
obj1=Demo()
obj2=Memo()
callfun(obj2)

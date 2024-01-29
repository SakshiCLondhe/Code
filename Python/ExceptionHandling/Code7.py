#Attribute Error
'''class Demo:
    def fun(self):
       print(" in fun")
    def gun(self):
        print(" In gun")
obj=Demo()
obj.fun()
obj=None
obj.gun()#AttributeError: 'NoneType' object has no attribute 'gun'
'''
class Demo:
    def fun(self):
        print(" in fun")
    def gun(self):
        print(" in gun ")

obj=Demo()
obj.fun()

obj.gun()

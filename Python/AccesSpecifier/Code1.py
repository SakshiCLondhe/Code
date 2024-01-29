class Demo:
    z=3 # public variable
    def __init__(self):
        self._x=10;   # protected 
        self.__y=20;   # private
obj1=Demo()
print(obj1._x)#protected
'''print(obj1.y)#private'''# Error no attribute error
print(obj1._Demo__y)# it is the correct way to access private variable
print(obj1.z)#public
#how to access private variable?
''' we can access private variable using __(classname)__(variable)'''

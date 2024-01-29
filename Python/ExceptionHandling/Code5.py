# Attribute Error: 'Demo' object has no attribute 'gun'. Did you mean: 'fun'?
'''class Demo:
     def fun(self):
          print(" In fun")
obj=Demo()
obj.gun()'''
#Correct Code
class Demo:
     def fun(self):
         print(" in fun")
obj=Demo()
obj.fun()

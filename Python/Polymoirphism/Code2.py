class Demo:
    def fun(self):
        print(" in fun")
class Memo:
    def gun(self):
        print(" in gun")
def callfunc(obj):
      print(id(obj1))
      print(id(obj2))
      print(id(obj4)) #obj4 is not declared before call the  callfunc method  so it gives th name error 
                      # Therefore   obj1 and obj2 are declared before calling  callfunc method so they are goes                       #in global frame 


obj1=Demo()
obj2=Memo()
obj3=Demo()
callfunc(obj2)
obj4=Demo()

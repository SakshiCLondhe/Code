# Destructor is gives the information  before delete the object (its olny gives the Notification)
# Garbage collector is used for deleting object 
class Parent:
    z=30
    def __init__(self):
        print("In parent Constructor")
        self.x=10
        self.y=20
    def dispdata(self):
        print(self.x)
        print(self.y)
    @classmethod
    def disParent(cls):
        print(cls.z)
    def __del__(self):
        print("In Destructor")
obj1=Parent()
obj1.dispdata()
obj1.disParent()
#del obj1    //Autometically call destructor 
obj1.__del__() #explicitally call to destructor 

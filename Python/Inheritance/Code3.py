class Company(object):
    x=10
    def __init__(self,CompName,loc):
        print("in constructor")
        self.CompName=CompName
        self.loc=loc
    def CompInfo(self):
        print(self.CompName)
        print(self.loc)
class Employee(Company):
    pass 
obj1=Employee("Microsoft","pune")
obj1.CompInfo()
obj2=Employee("Microsoft","Ban")
obj2.CompInfo()

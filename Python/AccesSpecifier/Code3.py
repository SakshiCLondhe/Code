class Parent1:
    def __init__(self):
        print("in parent 1 Constructor")
    def function__1(self):
        print("in fun1")
class Parent2:
    def __init__(self):
        print("in parent 2  Constructor")
    def function__2(self):
        print("in fun2")


class child1(Parent1, Parent2):# MRO =METHOD RESOLUTION ORDER
     pass                     # MRO rule is based on dsf=def first search
                              # it follows from left to right
                              # if parent1 is in 1st order then constructor of parent 1 is calls  

class child2(Parent2, Parent1):# MRO =METHOD RESOLUTION ORDER
     pass                    # MRO rule is based on dsf=def first search
                             # it follows from left to right
                             # if parent2 is in 1st order then constructor of parent 2 is calls
obj1=child1()
obj1.function__1()
obj1.function__2()
print("-----------")
obj2=child2()
obj2.function__1()
obj2.function__2()




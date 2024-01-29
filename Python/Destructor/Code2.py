class Parent:
    def __init__(self):
        print("in parent Constructor");
        self.x=10
        self.y=20
    def dis(self):
        print(self.x)
        print(self.y)
    def __del__(self):
        print("in destructor");
obj1=Parent()
obj1.dis()



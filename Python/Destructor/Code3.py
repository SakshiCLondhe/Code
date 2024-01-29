class Parent:
    z=30
    def __init__(self):
        print("In parent constructor")
        self.x=10
        self.y=20
    def dispdata(self):
        print(self.x)
        print(self.y)
    @classmethod
    def disParent(cls):
        print(cls.z)
    def __del__(self):
        print("obj destory")
obj1=Parent()
obj1.dispdata()
obj1.disParent()


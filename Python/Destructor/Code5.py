class Parent:
    def __init__(self):
        print(" In parent const")
        self.x=10
        self.y=20
    def dispdata(self):
        print(self.x)
        print(self.y)
class Child(Parent):
    def __init__(self):
        print(" In Child Constructor")
        self.x=30
        self.y=40
        super().__init__()
obj=Child()
obj.dispdata()

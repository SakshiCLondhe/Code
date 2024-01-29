#Method Overriding
class Parent:
    def Property(self):
        print("Gold,Car,Banglow")
    def Career(self):
        print("eng")
class child(Parent):
    def Career(self):
        print("Yt")
obj1=child()
obj1.Property()
obj1.Career()

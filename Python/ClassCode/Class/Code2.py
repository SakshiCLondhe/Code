class Employee:
    def __init__(self):
        print("in  constructor")
    def __new__(self):
        print("memory Allocate")
        
obj=Employee()


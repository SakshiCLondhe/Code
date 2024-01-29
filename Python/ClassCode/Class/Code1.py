class Employee:
    print ("In Microsoft class")
    name= "Sakshi"
    empId=123
    sal=7
    CompanyName= "Microsoft"
    def work(self):
        print("Software Developer:")
        print("Name: "+self.name)
        print("empId: "+str(self.empId))
        print("Com Name: "+self.CompanyName)
obj=Employee()# call goes to constructor
obj.work()# Internally work(obj) argument was passes


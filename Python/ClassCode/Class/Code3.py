# wrong code
'''class Demo:
    def __new__(self,jjj):
        print(" In Creater")
obj=Demo()'''
#Correct Code
class Demo:
    def __new__(self):
        print(" In creater/Memory Allocate")
Demo()

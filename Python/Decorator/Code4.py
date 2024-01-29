def run():
    print(" in run")
def fun(x):
    print(" in fun")
    x()
fun(run)

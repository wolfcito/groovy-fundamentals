package solutions.mundovirtual.app

def myVariable = 1000.33F

println myVariable
println myVariable.class

//without definition
myString = 'test'
println(myString)

//with temple string
name = "Luis Fernando"
myString = "Hello ${name}"
println(myString)

//with multipleline
myString = '''
All the power is with in you.
You can do anything and everything.
'''
println(myString)

//with validation
emailPattern = /([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)/
println("test@gmail.com" ==~ emailPattern)
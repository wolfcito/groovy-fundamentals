package solutions.mundovirtual.app

myCLosure = {
    println("Simple is better than complex")
}

myCLosureWithParameter = {
    isEven = 2 ->
    println( isEven%2==0?"Even": "Odd")
}

myCLosure.call()
myCLosureWithParameter.call()

7.times {myCounter -> println(myCounter)}

3.times { println(it)}
package solutions.mundovirtual.app

int product(int firstNumber, int secondNumber){
    return firstNumber * secondNumber
}

print product(10,4)

def product2(firstNumber, secondNumber){
     firstNumber * secondNumber
}

resutl = product2(10,4)
println(resutl)

void display(Map productDetails){
    println(productDetails.name)
    println(productDetails.price)
}

display([name: "phone", price: 1000.20])
package solutions.mundovirtual.app

aListOf = [1,2,3]
println(aListOf)
println(aListOf.class)

aListOf << 6
println(aListOf)

aListOf = aListOf + [7,0,9]
println(aListOf)

aListOf = aListOf - [1,0]
println(aListOf)

aListOf.each {println(it)}

aListOf.reverseEach {println(it)}

aListOf.eachPermutation {println(it)}
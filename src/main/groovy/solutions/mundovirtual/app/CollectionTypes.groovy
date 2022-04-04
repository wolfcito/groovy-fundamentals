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


//work with Set
aSetList =['Java', 'Python', 'javascript'] as Set
println(aSetList)
println(aSetList.class)

//work with Maps
aMap = [:]
println(aMap)

aMap = [courseName:'Gradle', rating: 10, price:100.0]
println(aMap)

aMap.each {k,v -> println("Key: ${k} , Value: ${v}")}
println(aMap.courseName)
println(aMap['courseName'])
println(aMap.get('courseName'))

aMap.newKey = "It's amazing :)"
println(aMap.get('newKey'))
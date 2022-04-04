package solutions.mundovirtual.app

class Patient {
    def firstName, lastName, age
    static hospitalCode = "Hospt 001"
//    validator
    void setLastName(lastname){
        if(lastname == null){
            throw new IllegalArgumentException("Lastname cannot be null")
        }
        this.lastName = lastname
    }

    static void display(){
        println hospitalCode
    }
}

person = new Patient(firstName: "Pepito", lastName: "Perez", age:20)
println person.firstName + " "+ person.lastName+ " "+person.age

Patient.display()

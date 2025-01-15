fun main() {
    // Works with a warning
    var names1 = arrayOf("Júlio", "Enzo", "Thais", 1)
    print(names1.contentToString())
    names1[0]= "André"
    // Only works beacuse we initialize the array with one integer
    names1[1]= 1
    print(names1.contentToString())

    // Do not work
    // var names2 = {"Benedito", "Rodrigo", "Hygor"}
    // print(names2.contentToString())

    // Do not work
    // var names3 = ["Benedito", "Rodrigo", "Hygor"]
    // print(names3.contentToString())

    var names4 = listOf("Estrela", "Valverde", "Fernando", 4)
    // Do not work
    // names4[0]= "André"
    print(names4)

    var names5 = arrayListOf("Benedito", "Rodrigo", "Hygor", 5)
    names5[0]= "André"
    print(names5)

}
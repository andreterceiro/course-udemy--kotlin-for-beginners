# General

Some studies retated to [this course](https://www.udemy.com/course/kotlin-for-beginners/)


# How to install the Kotlin compiler (kotlinc)

Please follow [this link](https://www.udemy.com/course/kotlin-for-beginners/)


# How to run Kotlin programs

Thinking in use the script 01-HelloWorld.kt:

```
kotlinc -include-runtime 01-HelloWorld.kt -d 01-HelloWorld.jar
java -jar 01-HelloWorld.jar
```

**Note**: In a sucessfull `jar` generation, `kotlinc` will not return anything.


# Private functions

You can have a private function without a class. Let's see the contents of the files `07-PrivateFunction.kt` and `07-PrivateFunctionAux.kt`.

`07-PrivateFunction.kt`:
```kotlin
private fun greet() {
    println("Hello")
}

fun main() {
    greet()
    hi()
    greet()
}
```

`07-PrivateFunctionAux.kt`:
```kotlin
fun hi() {
    println("Hi")
}
```

You can use the function `hi()` of the file `07-PrivateFunctionAux.kt` in the file `07-PrivateFunction.kt` if you include this file in the `.jar` generation. Example:

```sh
kotlinc -include-runtime 07-PrivateFunction.kt 07-PrivateFunctionAux.kt -d 07-PrivateFunction.jar
```

As you know, you can execute the `.jar` file this way:

```sh
java -jar 07-PrivateFunction.jar
```

But if you add the modifier "`private`" in the begginig of the file where we declare the funcion "`hi`" in the file `07-PrivateFunctionAux.php`, we will can't use the function "`hi`" om the file `-7-PrivateFunction.kt`.
abstract class Animal(val name: String) {
    abstract fun makeSound()
}
class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("AUAU!")
    }
}
class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("Miue!")
    }
}

fun animalSounds(animals: List<Animal>) {
    for (animal in animals) {
        animal.makeSound()
    }
}
fun main() {
    val dog = Dog("Fofo")
    val cat = Cat("Cleitinho")

    val animals = listOf(dog, cat)
    animalSounds(animals)
}


fun main(args: Array<String>) {
    val carRepository = CarRepository()

    carRepository.insert(Car(1, "Chevrolet", 500000.50f))
    carRepository.printAll()
    println(carRepository.findById(-1))
}
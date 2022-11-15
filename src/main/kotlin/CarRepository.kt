class CarRepository(){
    private var cars = mutableListOf<Car>()

    fun insert(car : Car) = cars.add(car)
    fun delete(car : Car) = cars.remove(car)
    fun deleteById(id : Int) = cars.removeAt(id)
    fun findById(id : Int) : Car? = cars.find { it.id == id }

    fun printAll(){
        println(cars)
    }
}
package commandObjects

import myplugin.Car

class Booty {

    Booty() {

    }

    def createCars() {
        List<String> carNames = ['Ferrari', 'C-class', 'Mercides', 'Duster', 'Wagon-R']
        Long amount = 250000
        if (Car.count() < 1) {
            carNames.each { name ->
                Car car = new Car(name: name, amount: amount)
                car.save()
                println "******* Creating Car ${name} *******"
                amount = amount + 25000
            }
        }
    }
}

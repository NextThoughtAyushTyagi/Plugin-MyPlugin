package myplugin

import grails.transaction.Transactional

@Transactional
class CommunicationService {

    def serviceMethod() {

    }

    def carListForSignUp() {
        List<Car> carList = Car.list()
        return carList
    }
}

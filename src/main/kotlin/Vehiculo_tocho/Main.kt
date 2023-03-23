import VehiculosRentin.Alquiler

fun main() {

/*
    var ferrari = Coche("1364AXV",8,2)

    var Rico = Autobus("7576UYE",30,60)

    var FH_Volvo = Camion("8743ZE",14,5)

    var Volkwagen = Furgoneta("7422ATY",5,2)

*/
    val alquilerPrincipal= Alquiler(5)
    alquilerPrincipal.imprimirRecibos()
    print(alquilerPrincipal.calcularTotalAlquileres())

}
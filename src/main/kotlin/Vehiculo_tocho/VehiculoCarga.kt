abstract class VehiculoCarga(tara: Int):Vehiculo("ab",12) {


    open var tara: Int = 0
        get() = field
        set(value) {

            field = value

        }

    override fun recibo() {

        println("La matricula es ${this.matricula},será alquilado durante ${this.duracion} días," +
                " llevará ${this.tara} toneladas y valdrá ${this.alquiler()} € ")

    }

}
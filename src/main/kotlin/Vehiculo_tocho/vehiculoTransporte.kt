abstract class VehiculoTransporte(plazas:Int):Vehiculo("ab",12) {


    open var plazas: Int = 2
        get() = field
        set(value) {

            field = value

        }


    override fun recibo() {

        println("La matrícula es ${this.matricula},será alquilado durante ${this.duracion} días," +
                "tiene ${this.plazas} plazas y costará ${this.alquiler()} €")

    }
}
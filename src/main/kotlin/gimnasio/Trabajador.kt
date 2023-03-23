package gimnasio

open class Trabajador(Nombre:String,Edad:Int,SeguroSocial:Int,Sueldo:Int):Persona(Nombre,Edad) {
    var seguro_social = 0
    var sueldo = 0

    init {
        seguro_social = SeguroSocial
        var sueldo = Sueldo
    }

    override fun balanceMensual() {
        var total=0
        total = -seguro_social-sueldo

    }


}
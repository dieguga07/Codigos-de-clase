package gimnasio

open class SocioPlus(Nombre:String, Edad:Int, NumeroSocio:Int):Socio(Nombre,Edad,NumeroSocio) {


    override fun balanceMensual() {
        var total = 0
        if (edad<=18){
            total = 40
        }else{
            total = 60
        }
    }

















}
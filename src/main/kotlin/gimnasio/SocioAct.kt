package gimnasio

open class SocioAct(Nombre:String, Edad:Int, NumeroSocio:Int,ListaActividades:MutableList<Int>):Socio(Nombre,Edad,NumeroSocio) {

    var lista_actividades = ListaActividades
        get() {
            return field
        }
        set(value) {

            if (value != lista_registro){
                field = value
            }
            else{
                lista_actividades.add(3)
            }
        }

    fun anadir_activida(numero:Int){
        if (numero !in lista_registro){
            lista_actividades.add(numero)
        }

    }

    override fun balanceMensual() {
        var total = 0
        if (edad>=16){

        }
    }


    override fun toString(): String {
        return "SocioAct(lista_actividades=$lista_actividades)"
    }


}
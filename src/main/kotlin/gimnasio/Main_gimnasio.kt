package gimnasio

fun main (){

    var trabajador1 = Trabajador("pepe",25,20,1100)
    var trabajador2 = Trabajador("maria",23,21,1700)
    var socio = Socio("Simon",19,1)
    var socio_actividad1 = SocioAct("macos",20,2,mutableListOf(1,2))
    var socio_actividad2 = SocioAct("paula",20,3, mutableListOf(1,2,3))
    var socio_plus = SocioPlus("Lucia",19,4)

    //anadirPersonas.(trabajador1)
    //anadirPersonas.(trabajador2)
    //anadirPersonas.(socio)
    //anadirPersonas.(socio_actividad1)
    //anadirPersonas.(socio_actividad2)
    //anadirPersonas.(socio_plus)

    trabajador1.balanceMensual()
    trabajador2.balanceMensual()
    socio.balanceMensual()
    socio_actividad1.balanceMensual()
    socio_actividad2.balanceMensual()
    socio_plus.balanceMensual()

}
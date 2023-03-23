package Ficheros
import java.io.File


import java.util.*



fun main(args: Array<String>){

    val documento1 = File("prueba_practica.pdf")

    val documento2 = File("Actividad desarrollo 5.docx")

    val documento3 = File("RW_Kotlin_Cheatsheet_1_0.pdf")

    val documento4 = File("EDES_ProyectoFinal.pdf")

    var lista_documentos = mutableListOf(documento1,documento2,documento3,documento4)


    for (i in lista_documentos.sortWith(compareByDescending { it.length()})){

    }


}
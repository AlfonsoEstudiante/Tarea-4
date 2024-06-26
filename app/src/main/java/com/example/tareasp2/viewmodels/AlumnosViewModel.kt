package com.example.tareasp2.viewmodels

import com.example.tareasp2.R
import com.example.tareasp2.models.Alumnos

class AlumnosViewModels {

    fun getListaAlumnos(): ArrayList<Alumnos> {
        val alumnList: ArrayList<Alumnos> = ArrayList()

        //Create list
        alumnList.add(Alumnos(22180, "Alfonso Madero Benítez", "alfonso.madero@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.0, 0, R.drawable.cap))
        alumnList.add(Alumnos(22208, "David Alejandro Rivera Luna", "david.rivera@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.0, 1, R.drawable.cap))
        alumnList.add(Alumnos(22210, "Raymundo Gutiérrez Guerrero", "raymundo.gutierrez@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", false, 8.8, 0, R.drawable.cap))
        alumnList.add(Alumnos(19475, "Edson De Jesus Maya Mendez", "edson.maya@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.5, 0, R.drawable.cap))
        alumnList.add(Alumnos(19508, "Aylin Alvarez Hernandez", "aylin.alvarez@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.6, 5, R.drawable.cap))
        alumnList.add(Alumnos(19523, "Yoselin Alejandra Mojica Ahumada ", "yoselin.mojica@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", false, 9.1, 0, R.drawable.cap))
        alumnList.add(Alumnos(19666, "Sebastián Rubio Quiroz", "sebastian.rubio@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.85, 0, R.drawable.cap))
        alumnList.add(Alumnos(21637, "Josue David Arreola Aguilera", "josue.arreola@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.85, 6, R.drawable.cap))
        alumnList.add(Alumnos(21767, "María Fernanda Villarreal Mar", "maria.villarreal02@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.2, 3, R.drawable.cap))
        alumnList.add(Alumnos(22098, "Gerardo Torres García", "gerardo.torres@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.3, 1, R.drawable.cap))
        alumnList.add(Alumnos(22154, "Luis Javier Zapata Perales", "luis.zapata01@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.3, 0, R.drawable.cap))

        return alumnList
    }
}
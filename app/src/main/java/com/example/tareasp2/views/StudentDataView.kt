package com.example.tareasp2.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tareasp2.R


@Composable
fun AlumnView(
    navController: NavHostController,
    id: Int,
    name: String,
    mail: String,
    semester: Int,
    career: String,
    hasScolarship: Boolean,
    gpa: Float,
    soldTickets: Int,
    profilePic: Int
) {
    val hasScolarshipString = if (hasScolarship) "Si" else "No"

    Column (
        modifier = Modifier.fillMaxSize().padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = profilePic),
            contentDescription = "AlumnPic",
            modifier = Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = id.toString(),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = mail,
            color = Color(0xFFD4A73C),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column (
            modifier = Modifier
                .background(Color(0xFFF9EBCF), shape = RoundedCornerShape(15.dp))
                .padding(15.dp)
        ) {
            Text(
                text = "Semestre: $semester",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Carrera: $career",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Tiene beca: $hasScolarshipString",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Promedio general: $gpa",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Boletos Anáhuac vendidos: $soldTickets",
                fontSize = 20.sp,
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {navController.popBackStack()},
            colors = ButtonDefaults.buttonColors(Color(0xFFD4A73C)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 5.dp)
        ) {
            Text(
                text = "Volver",
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_Alumn() {
    AlumnView(
        navController = rememberNavController(),
        id = 22180,
        name = "Alfonso Madero Benítez",
        mail = "alfonso.madero@iest.edu.mx",
        semester = 8,
        career = "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)",
        hasScolarship = true,
        gpa = 8.65.toFloat(),
        soldTickets = 0,
        profilePic = R.drawable.cap
    )
}
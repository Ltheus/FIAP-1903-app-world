package br.com.fiap.appworld.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.appworld.R
import br.com.fiap.appworld.components.AppLayout
import br.com.fiap.appworld.ui.theme.DarkBlue

@Composable
fun HomeScreen() {
    AppLayout(){
        Column (
            Modifier
                .fillMaxSize()
                .padding(10.dp)) {
            Text(
                text = "Bem-vindo(a)!",
                fontSize = 32.sp,
                fontWeight = FontWeight(700)
            )
            Image(
                painter = painterResource(id = R.drawable.infoweather_icon),
                contentDescription = "InfoWeather Icon",
            )
            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text(text = "Em que cidade você está?")
            }, placeholder = {
                Text(text = "Digite o nome da cidade.")
            },)
        }
    }

}
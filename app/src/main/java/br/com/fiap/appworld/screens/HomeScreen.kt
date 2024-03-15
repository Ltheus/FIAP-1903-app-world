package br.com.fiap.appworld.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.appworld.R
import br.com.fiap.appworld.components.AppLayout
import br.com.fiap.appworld.ui.theme.BackgroundWhite
import br.com.fiap.appworld.ui.theme.DarkBlue

@Composable
fun HomeScreen(navController: NavController) {
    AppLayout() {
        Column(
            Modifier
                .fillMaxSize()
                .padding(10.dp)
                .background(color = BackgroundWhite),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
        ) {
            Text(
                text = "Bem-vindo(a)!",
                fontSize = 32.sp,
                fontWeight = FontWeight(700),
                color = DarkBlue
            )
            Image(
                painter = painterResource(id = R.drawable.infoweather_icon),
                contentDescription = "InfoWeather Icon",
                modifier = Modifier.size(width = 170.dp, height = 170.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = DarkBlue,
                    unfocusedBorderColor = DarkBlue,
                    focusedLabelColor = DarkBlue,
                    unfocusedLabelColor = DarkBlue,
                ),
                shape = RoundedCornerShape(15.dp),
                label = {
                    Text(text = "Em que cidade você está?")
                },
                placeholder = {
                    Text(text = "Digite o nome da cidade")
                },
                keyboardOptions = KeyboardOptions(KeyboardCapitalization.Words),
                trailingIcon = {
                    IconButton(onClick = { navController.navigate("weather") }) {
                        Icon(
                            imageVector = Icons.Default.Send,
                            contentDescription = "Arrow",
                            tint = DarkBlue
                        )
                    }
                }
            )
        }
    }

}
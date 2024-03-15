package br.com.fiap.appworld.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.appworld.R
import br.com.fiap.appworld.components.AppLayout
import br.com.fiap.appworld.ui.theme.BackgroundWhite
import br.com.fiap.appworld.ui.theme.DarkBlue
import br.com.fiap.appworld.ui.theme.TextBlack
import br.com.fiap.appworld.ui.theme.Yellow

@Composable
fun WeatherScreen() {
    AppLayout() {
        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 5.dp, vertical = 10.dp)
                .background(color = BackgroundWhite),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Text(
                text = "Hoje",
                fontSize = 28.sp,
                fontWeight = FontWeight(700),
                color = DarkBlue
            )
            Image(
                painter = painterResource(id = R.drawable.sun_icon),
                contentDescription = "Sun image",
                modifier = Modifier.size(width = 170.dp, height = 170.dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                Text(
                    text = "Min: 26 Cº | Max: 34 Cº",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(700),
                    color = TextBlack
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
//                    .background(color = Yellow),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.droplet_icon),
                        contentDescription = "Sun image",
                        modifier = Modifier.size(width = 16.dp, height = 16.dp)
                    )
                    Text(
                        text = ": 63%",
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                        color = TextBlack
                    )
                }
            }
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
                    Text(text = "Pesquisar cidades")
                },
                placeholder = {
                    Text(text = "Digite o nome da cidade")
                },
                keyboardOptions = KeyboardOptions(KeyboardCapitalization.Words),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Arrow",
                            tint = DarkBlue
                        )
                    }
                }
            )
        }
    }

}
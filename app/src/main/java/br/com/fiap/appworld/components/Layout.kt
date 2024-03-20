package br.com.fiap.appworld.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import br.com.fiap.appworld.R

@Composable
fun AppLayout(
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6F9FB))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF033A8E))
                .height(50.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.infoweather),
                contentDescription = stringResource(id = R.string.infoweather_logo),
                modifier = Modifier.fillMaxSize()
            )
        }
        Layout(content = content) { measurable, constraints ->
            val placeable =
                measurable.map { it.measure(constraints.copy(minWidth = 0, minHeight = 0)) }

            val height = 0
            val width = 0
            layout(constraints.maxWidth, constraints.maxHeight) {
                placeable.forEach {
                    it.place(x = width, y = height)
                }
            }
        }
    }
}
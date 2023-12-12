package com.example.composeacademylessons.Presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.composeacademylessons.Data.CarModel


@Composable
fun CarItem(
    carModel: CarModel
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
        ) {
            AsyncImage(
                modifier = Modifier.size(130.dp).clip(RoundedCornerShape(20.dp)),
                model = carModel.carImage,
                contentDescription = null
            )
            Column(
                modifier = Modifier.padding(start = 8.dp)
            ) {
               Text(
                   text = carModel.carModel,
                   fontSize = 20.sp,
                   color = Color.Black,
                   fontWeight = FontWeight.Bold
               )
                Text(
                    text = carModel.carName,
                    fontSize = 15.sp,
                    color = Color.Black,
                    )
                Text(
                    text = carModel.carSpeed,
                    fontSize = 15.sp,
                    color = Color.Black,
                )
            }
        }
    }
}

package com.example.compose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compose.R

@Composable
fun MessageCard(name: String) {
    Row(Modifier.padding(all= 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "background",
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Hello $name",
            color = MaterialTheme.colors.secondaryVariant,
            style = MaterialTheme.typography.subtitle1
        )
    }

}



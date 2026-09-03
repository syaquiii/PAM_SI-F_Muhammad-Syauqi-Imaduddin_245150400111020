package com.example.modul_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfilMahasiswa() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(contentAlignment = Alignment.TopEnd) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Ikon Profil",
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.Cyan)
                    .clip(CircleShape)
            )
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Ikon Profil",
                modifier = Modifier.size(15.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = "Nama: Muhammad Syauqi Imaduddin",
                fontWeight = FontWeight.Bold
            )
            Text(text = "NIM: 245150400111020")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfilMahasiswa() {
    ProfilMahasiswa()
}

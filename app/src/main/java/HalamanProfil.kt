package com.example.modul_2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanProfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        // Box: Avatar Profil dengan Ikon Edit di Pojok
        Box(
            contentAlignment = Alignment.BottomEnd
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE0E0E0))
                    .border(2.dp, Color(0xFF6200EE), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Foto Profil",
                    modifier = Modifier.size(60.dp),
                    tint = Color(0xFF6200EE)
                )
            }

            // Sub-Box untuk Ikon Edit
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF6200EE)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Edit Profil",
                    modifier = Modifier.size(16.dp),
                    tint = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Text: Nama dan Status
        Text(
            text = "Muhammad Syauqi Imaduddin",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = "Mahasiswa - Sistem Informasi",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Row: Statistik Profil (NIM, Kelas, Prodi)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ItemStatistik(judul = "NIM", nilai = "245150400111020")
            ItemStatistik(judul = "Kelas", nilai = "PAM - SI F")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Detail Informasi Akademik & Kontak
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Informasi Mahasiswa",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(12.dp))

                ItemInfoKontak(
                    icon = Icons.Default.Info,
                    label = "Program Studi",
                    value = "Sistem Informasi"
                )

                Spacer(modifier = Modifier.height(8.dp))

                ItemInfoKontak(
                    icon = Icons.Default.Email,
                    label = "Email Student",
                    value = "syauqiimd@student.ub.ac.id"
                )

                Spacer(modifier = Modifier.height(8.dp))

                ItemInfoKontak(
                    icon = Icons.Default.LocationOn,
                    label = "Lokasi",
                    value = "Malang, Jawa Timur"
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Edit Profil")
        }
    }
}

@Composable
fun ItemStatistik(judul: String, nilai: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = nilai,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color(0xFF6200EE)
        )
        Text(
            text = judul,
            fontSize = 12.sp,
            color = Color.Gray
        )
    }
}

@Composable
fun ItemInfoKontak(icon: ImageVector, label: String, value: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier.size(20.dp),
            tint = Color(0xFF6200EE)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = label,
                fontSize = 11.sp,
                color = Color.Gray
            )
            Text(
                text = value,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHalamanProfil() {
    HalamanProfil()
}

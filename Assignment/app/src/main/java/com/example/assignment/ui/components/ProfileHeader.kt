package com.example.assignment.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.R

@Composable
fun ProfileHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.person),
                contentDescription = "Profile picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape)
            )
            Column(horizontalAlignment = Alignment.Start) {
                Text(modifier = Modifier.padding(start = 20.dp),
                    text = "Paras",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ProfileRow("Posts", "54")
                    ProfileRow("Followers", "834")
                    ProfileRow("Following", "162")
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text("Professional Android developer", fontSize = 13.sp)
    }
}

@Composable
fun ProfileRow(label: String, count: String) {
    Column(horizontalAlignment = Alignment.Start) {
        Text(count, fontWeight = FontWeight.Bold,  fontSize = 15.sp)
        Text(label,  fontSize = 14.sp)
    }
}
package com.example.kartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kartunama.ui.theme.KartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuNamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFECE3CE)
                ) {
                    NameCard("Aminudin Abdulloh", "Android Developer Extraordinaire")
                }
            }
        }
    }
}

@Composable
fun NameCard(name: String,title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.profil),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
        )

        Text(
            text = "$name",
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(10.dp)
        )
        Text(
            text = "$title",
            color = Color(0xFF4F6F52),
            fontWeight = FontWeight.Bold,
        )
    }

    ContactMe(tlp = "+6282259652350", smHandle = "@AndroidDev", email = "AminudinAbdulloh@gmail.com")
}

@Composable
fun ContactMe(tlp: String, smHandle: String, email: String){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
    ) {
        Row(
            modifier = Modifier
                .padding(100.dp, 0.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.telephone_handle_silhouette),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(text = "$tlp")
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .padding(100.dp, 0.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.share),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(text = "$smHandle")
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .padding(100.dp, 10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.email),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(text = "$email")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    KartuNamaTheme {
        NameCard("Aminudin Abdulloh","Android Developer Extraordinaire")
    }
}
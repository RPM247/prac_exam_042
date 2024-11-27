package com.rpm24.prac_exam_042

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rpm24.prac_exam_042.ui.theme.Prac_exam_042Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prac_exam_042Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EventEase(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun EventEase(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.backicon),
                contentDescription = null
            )
            Text(
                text = "EventEase",
                modifier = Modifier.padding(start = 10.dp)
            )
            Image(
                painter = painterResource(R.drawable.share),
                contentDescription = null,
                modifier = Modifier.padding(start = 180.dp)
            )
        }
        Image(
            painter = painterResource(R.drawable.event),
            contentDescription = "Event Image",
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
        )
        Row {
            Text(
                text = "Tech Conference 2024",
                modifier = Modifier
                    .padding(top = 16.dp) // Adjusts spacing from the image above
                    .fillMaxWidth(), // Makes the text span the entire row width
                fontSize = 20.sp // Optional styling
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Prac_exam_042Theme {
        EventEase()
    }
}

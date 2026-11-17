package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

private val CardBackground = Color(0xFFD2E8D4)
private val LogoBackground = Color(0xFF073042)
private val AccentGreen = Color(0xFF006D3B)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCard(
                        fullName = stringResource(R.string.full_name),
                        title = stringResource(R.string.job_title),
                        phone = stringResource(R.string.phone),
                        handle = stringResource(R.string.handle),
                        email = stringResource(R.string.email)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    fullName: String,
    title: String,
    phone: String,
    handle: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(CardBackground)
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CardHeader(
            fullName = fullName,
            title = title,
            modifier = Modifier.weight(1f)
        )
        ContactInfo(
            phone = phone,
            handle = handle,
            email = email,
            modifier = Modifier.padding(bottom = 32.dp)
        )
    }
}

@Composable
fun CardHeader(fullName: String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .background(LogoBackground)
                .padding(16.dp)
        )
        Text(
            text = fullName,
            fontSize = 36.sp,
            lineHeight = 42.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 24.dp, top = 8.dp, end = 24.dp)
        )
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = AccentGreen,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 24.dp, top = 4.dp, end = 24.dp)
        )
    }
}

@Composable
fun ContactInfo(phone: String, handle: String, email: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        ContactRow(iconRes = R.drawable.ic_call, text = phone)
        ContactRow(iconRes = R.drawable.ic_share, text = handle)
        ContactRow(iconRes = R.drawable.ic_email, text = email)
    }
}

@Composable
fun ContactRow(iconRes: Int, text: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(iconRes),
            contentDescription = null,
            tint = AccentGreen
        )
        Text(
            text = text,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(
            fullName = "Ignacio Cardenas Olivares",
            title = "Estudiante de Ingeniería de Sistemas Computacionales - UPB",
            phone = "+591 72598545",
            handle = "@nachocar64",
            email = "ignaciocardenasolivares@gmail.com"
        )
    }
}
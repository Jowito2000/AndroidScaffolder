package com.jowito.androidscaffolder.ui.example

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jowito.androidscaffolder.R

@Composable
fun ExampleScreen(navigateToList: () -> Unit) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
            padding ->
        Login( Modifier.padding(padding), navigateToList)
    }
}

@Preview(showBackground = true)
@Composable
fun ExamplePreview() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
            padding ->
        Login( Modifier.padding(padding)) { }
    }
}

@Composable
fun Login(modifier: Modifier, navigateToList: () -> Unit) {
    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center) {
        HeaderImage(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(16.dp))
        EmailField()
        Spacer(modifier = Modifier.padding(4.dp))
        PasswordField()
        Spacer(modifier = Modifier.padding(8.dp))
        ForgotPassword(Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.padding(16.dp))
        LoginButton(navigateToList)
    }
}

@Composable
fun HeaderImage(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Imagen de inicio de Sesion",
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun EmailField() {
    var text by remember { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = {text = it},
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text("Email") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color(0xFF2791FF),
            unfocusedContainerColor = Color(0xFFFFFFFF),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun PasswordField() {
    var text by remember { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = {text = it},
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text("Contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color(0xFF2791FF),
            unfocusedContainerColor = Color(0xFFFFFFFF),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "¿Olvidaste la contraseña?",
        modifier = modifier.clickable {},
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color(
            0xFF237DFF
        )
    )
}

@Composable
fun LoginButton(navigateToList: () -> Unit) {
    Button(
        onClick = {
            navigateToList()
        }, modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF275AF3),
            disabledContainerColor = Color(0xFF787878),
            contentColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Text(text = "Iniciar Sesión")
    }
}
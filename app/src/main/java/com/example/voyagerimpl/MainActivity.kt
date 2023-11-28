package com.example.voyagerimpl

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import com.example.voyagerimpl.ui.theme.VoyagerImplTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VoyagerImplTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Navigator(UserType)


                }
            }
        }
    }
}

object UserType : Screen {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current


        Scaffold(topBar = {

        }) {

            LazyColumn(

                Modifier
                    .background(Color(0xFFFBF5FF))
                    .fillMaxSize()
                    .fillMaxWidth()
                    .fillMaxHeight()


            ) {

                item {

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),


                            text = "What type of user are you?",

                            // Title Medium
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 24.sp,
                                //   fontFamily = FontFamily(Font(R.font.poppins)),
                                fontWeight = FontWeight(500),
                                color = Color(0xFF1C1C1C),
                                textAlign = TextAlign.Center,
                                letterSpacing = 0.15.sp,
                            )
                        )
                        Spacer(modifier = Modifier.height(50.dp))

                        Button(onClick = {
                            navigator?.push(LoginScreen)


                        }) {
                            Text(text = "Next Screen")

                        }

                    }

                }


            }


        }

    }
}

object LoginScreen : Screen {


    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    override fun Content() {

        Details()


    }

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Details() {
    var fullName by remember {
        mutableStateOf("")
    }



    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Mentorlst")

        })


    }

    ) {
        LazyColumn(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xFFFBF5FF))
        ) {
            item {

                Column(
                    modifier = Modifier
                        .padding(top = 100.dp, start = 20.dp, end = 20.dp)
                        .fillMaxSize(),
                    //   verticalArrangement = Arrangement.spacedBy(20.dp),
                    // horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Welcome to Mentorlst",

                        // Title Large
                        style = TextStyle(
                            fontSize = 22.sp,
                            lineHeight = 28.sp,
                            //  fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF1C1C1C),
                        )
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Create an account below",

                        // Body Large
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            //    fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF8C8C8C),
                            letterSpacing = 0.5.sp,
                        )
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Full name",

                        // Label Large
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            // fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF1C1C1C),
                            letterSpacing = 0.1.sp,
                        )
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    /*
                    //basic Textfield having errors


                                        BasicTextField(
                                            value = fullName,
                                            onValueChange = {
                                                fullName= it.toString()
                                            },
                                            label = "Full name",
                                            modifier = Modifier
                                                .border(
                                                    width = 0.5.dp,
                                                    color = Color(0xFF75818F),
                                                    shape = RoundedCornerShape(10.dp),

                                                    )

                                                .fillMaxWidth()
                                                .height(50.dp),


                                            colors = TextFieldDefaults.colors(
                                                focusedIndicatorColor = Color.Transparent,
                                                unfocusedIndicatorColor = Color.Transparent,
                                                cursorColor = Color.Black,
                                                focusedContainerColor = Color.Transparent,
                                                unfocusedContainerColor = Color.Transparent

                                            ),
                                            Text(
                                                text = "Full name",

                                                // Body Large
                                                style = TextStyle(
                                                    fontSize = 16.sp,
                                                    lineHeight = 24.sp,
                                                    //    fontFamily = FontFamily(Font(R.font.poppins)),
                                                    fontWeight = FontWeight(400),
                                                    color = Color(0xFF8C8C8C),
                                                    letterSpacing = 0.5.sp,
                                                )
                                            ),


                                            keyboardOptions = KeyboardOptions(
                                                keyboardType = KeyboardType.Text,
                                                imeAction = ImeAction.Done
                                            ),
                                            singleLine = true,


                                            )
                    */


                }

            }

        }

    }


}
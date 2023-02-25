package com.clinton.mytaskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clinton.mytaskmanager.ui.theme.MyTaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManagerImage(name = "All tasks complete", comment="Nice work")
                }
            }
        }
    }
}
@Composable
fun TaskManagerImage(name: String, comment: String){
val image = painterResource(id = R.drawable.task_manager)
    Column (modifier =  Modifier .fillMaxWidth().fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center )
    {
        Image(painter=image, contentDescription=null, modifier = Modifier.padding(bottom = 50.dp))
        TaskManagerText(name = "All tasks complete", comment="Nice work")
    }


}
@Composable
fun TaskManagerText(name: String, comment: String) {
    Column(){
        Text(text = " $name", modifier = Modifier.padding(start=50.dp, top=200.dp, bottom = 10.dp))
        Text(text = " $comment", textAlign = TextAlign.Justify,modifier = Modifier.padding(start=50.dp,))
    }
    }


@Preview(showBackground = false)
@Composable
fun TaskManagerTextPreview() {
    MyTaskManagerTheme {
        TaskManagerImage(name = "All tasks complete", comment="Nice work")
    }
}

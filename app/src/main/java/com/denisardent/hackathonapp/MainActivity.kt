package com.denisardent.hackathonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.denisardent.hackathonapp.presentation.subjectsscreen.SubjectsScreen
import com.denisardent.hackathonapp.presentation.subjectsscreen.SubjectsViewModel
import com.denisardent.hackathonapp.ui.theme.HackathonAppTheme

class MainActivity : ComponentActivity() {

    val viewModel by viewModels<SubjectsViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackathonAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SubjectsScreen(viewModel = viewModel)
                }
            }
        }
    }
}
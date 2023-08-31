package net.simplifiedcoding.ui.services

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.simplifiedcoding.R
import net.simplifiedcoding.ui.auth.AuthViewModel

@Composable
fun ServicesScreen(viewModel: AuthViewModel?, navController: NavHostController) {

    Text(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .background(Color.Magenta)
        .padding(10.dp)
        .padding(10.dp),

        fontSize = 25.sp,
        color = Color.DarkGray,
        text = stringResource(id = R.string.Services))
}
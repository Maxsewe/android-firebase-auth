package net.simplifiedcoding.ui.employees

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
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
fun EmployeesScreen(viewModel: AuthViewModel?, navController: NavHostController) {

    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Magenta)
        .padding(10.dp)
        .padding(10.dp)
        )
    {
        Text( fontSize = 25.sp,
            color = Color.Yellow,
            text = stringResource(id = R.string.Employees))
    }
}
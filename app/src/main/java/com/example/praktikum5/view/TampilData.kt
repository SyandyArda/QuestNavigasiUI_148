package com.example.praktikum5.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.praktikum5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()->Unit
){
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = "Contoh Nama"),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = "Lainnya"),
        Pair(first = stringResource(id = "ALAMAT"), second = "Yogyakarta")
    )
    Scaffold (modifier = Modifier,
        {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id=R.string.tampil),
                        color = Color.White
                    )},
                colors = TopAppBarDefaults
                    .mediumTopAppBarColors(colorResource
                        (id = R.color.teal_700)
                    )
            )
        }){     isiRuang->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.padding(dimensionResource(id=R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource
                    (R.dimen.padding_small))
            ) {
                items.forEach { items ->
                    Column {
                        Text(text = item.first.uppercase(),
                            fontSize = 16.sp)
                        Text()
                    }
                }
            }
        }

    }
}
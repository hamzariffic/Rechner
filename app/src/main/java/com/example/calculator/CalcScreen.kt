package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.Orange

@Composable
fun CalcScreen(
    viewModel: CalculatorViewModel,
    modifier: Modifier = Modifier,
    onClickAction:() -> Unit,
    text:String
) {
    Box(modifier=modifier){
        Column(modifier= Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter)) {
            Text(
                text = text,
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                textAlign = TextAlign.End,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                CalcButton(symbols = "AC", modifier = Modifier
                    .aspectRatio(2f)
                    .weight(2f),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "Del", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(color = Color.Gray),
                    onClick = {
                        onClickAction
                    })
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                CalcButton(symbols = "7", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "8", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(color = Color.Gray),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "9", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(
                        color = Color.DarkGray
                    ),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "x", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(
                        Orange
                    ),
                    onClick = {
                        onClickAction
                    })
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                CalcButton(symbols = "4", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "5", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(color = Color.Gray),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "6", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(
                        color = Color.DarkGray
                    ),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "-", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(
                        Orange
                    ),
                    onClick = {
                        onClickAction
                    })
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                CalcButton(symbols = "1", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "2", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(color = Color.Gray),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "3", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(
                        color = Color.DarkGray
                    ),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "+", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(
                        Orange
                    ),
                    onClick = {
                        onClickAction
                    })
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                CalcButton(symbols = "0", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = ".", modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
                    .background(color = Color.Gray),
                    onClick = {
                        onClickAction
                    })
                CalcButton(symbols = "=", modifier = Modifier
                    .aspectRatio(2f)
                    .weight(2f)
                    .background(
                        Orange
                    ),
                    onClick = {
                        onClickAction
                    })
            }
        }
            }
        }


//@Preview
//@Composable
//fun CalcScreenPreview(){
//    CalcScreen()
//}
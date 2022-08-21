package com.hlq.appbase.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlq.appbase.R

/**
 * @author：HuangLinqing
 * @date ：2022/4/18
 * @desc：请求错误视图
 */
@Composable
fun ErrorContent(onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.mipmap.img_error),
            contentDescription = null
        )

        Text(text = stringResource(R.string.load_error), fontSize = 15.sp, color = Color.LightGray)

        Button(
            modifier = Modifier.padding(vertical = 10.dp),
            onClick = {
                onClick()
            }, colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(id = R.color.blue)
            )
        ) {
            Text(text = stringResource(R.string.load_retry), fontSize = 15.sp, color = Color.White)
        }

    }
}

@Preview
@Composable
fun show() {
    ErrorContent {

    }
}
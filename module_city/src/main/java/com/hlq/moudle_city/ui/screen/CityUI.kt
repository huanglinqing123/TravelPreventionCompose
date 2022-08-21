package com.hlq.moudle_city.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hlq.module_city.bean.reqbean.CityDataReqData
import com.hlq.moudle_city.ui.theme.lightGray

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：城市数据页面
 */
@Composable
fun CityUI(
    citysData: CityDataReqData.CitysData,
    onClick: (CityDataReqData.CitysData) -> Unit,
    firstLetterIsShow: Boolean
) {
    Column {
        val modif = Modifier
            .padding(start = 10.dp)
        if (firstLetterIsShow) {
            Text(
                text = citysData.firstLetter.toString(),
                modifier = Modifier
                    .height(30.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .background(lightGray).then(modif),
            )
        }
        Text(
            text = citysData.city.toString(),
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(Color.White)
                .align(Alignment.CenterHorizontally)
                .then(modif)
                .clickable {
                    onClick(citysData)
                },
        )

    }
}

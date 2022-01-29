package me.naingaungluu.jetpackcomposedemo.ui.screens.stateManagementDemo

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

@Preview(showBackground = true)
@Composable
fun StateManagementDemoScreen(
    valueLiveData : LiveData<Int> = MutableLiveData(),
    onTapAdd: () -> Unit = {},
    onTapSubtract: () -> Unit = {}
) {
    val valueState = valueLiveData.observeAsState()
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        valueState.value?.let {
            NumberControl(it, onTapAdd, onTapSubtract)
        }
    }
}

@Composable
fun NumberControl(
    value : Int = 0,
    onTapAdd : () -> Unit = {},
    onTapSubtract : () -> Unit = {}
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(onClick = onTapSubtract) {
            Text(text = "-")
        }

        Text(
            text = value.toString(),
            modifier = Modifier.padding(20.dp),
            style = MaterialTheme.typography.h6,
        )

        Button(onClick = onTapAdd) {
            Text(text = "+")
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimatedNumber(value : Int) {
    AnimatedContent(targetState = value) { targetValue ->
        Text(
            text = targetValue.toString(),
            modifier = Modifier.padding(20.dp),
            style = MaterialTheme.typography.h6,
        )
    }
}
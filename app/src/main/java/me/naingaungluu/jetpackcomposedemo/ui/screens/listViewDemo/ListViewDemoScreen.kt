package me.naingaungluu.jetpackcomposedemo.ui.screens.listViewDemo

import androidx.cardview.widget.CardView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.naingaungluu.jetpackcomposedemo.R
import me.naingaungluu.jetpackcomposedemo.ui.themes.White

@Preview (showBackground = true)
@Composable
fun ListViewDemoScreen() {
    LazyColumn {
        item {
            Text(
                text = "Horizontal Section",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(8.dp)
            )
        }
        item {
            HorizontalSection()
        }
        item {
            Text(
                text = "Vertical Section",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(8.dp)
            )
        }
        items(5) {
            VerticalListItem()
        }
    }
}

@Composable
fun HorizontalSection() {
    LazyRow {
        items(5) {
            HorizontalListItem()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HorizontalListItem(articleName : String = "Article 1") {
    Card(
        shape = MaterialTheme.shapes.large,
        modifier = Modifier
            .width(120.dp)
            .padding(8.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.ic_place_holder),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(White),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(Color.Gray)
            )
            Text(
                text = articleName,
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier
                    .padding(start = 8.dp, bottom = 8.dp, top = 8.dp)
            )
            Text(
                text = "Author Name",
                style = MaterialTheme.typography.caption,
                modifier = Modifier.padding(start = 8.dp, bottom = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VerticalListItem(articleName: String = "Article 1") {
    Card(
        shape = MaterialTheme.shapes.large,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_place_holder),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(White),
                modifier = Modifier
                    .weight(0.35f)
                    .height(120.dp)
                    .background(Color.Gray)
            )
            Column(
                modifier = Modifier.weight(0.65f)
                    .padding(16.dp)
            ) {
                Text(
                    text = articleName,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Author Name",
                    style = MaterialTheme.typography.caption
                )
            }
        }
    }
}

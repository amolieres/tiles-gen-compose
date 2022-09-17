package com.amolieres.tilesGenCompose.feature_tile.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tile(
                val color: Int,
                val rawValue: Int,
                @PrimaryKey val index: Int) {

    /*companion object {
        val tileColors = listOf(Gray, White, Black)
    }*/
}



package com.amolieres.tilesGenCompose.feature_tile.domain.repository

import com.amolieres.tilesGenCompose.feature_tile.domain.model.Tile
import kotlinx.coroutines.flow.Flow

interface TileRepository {

    fun getTiles(): Flow<List<Tile>>

    suspend fun insertTiles(tiles: List<Tile>)

    suspend fun clearTiles()
}
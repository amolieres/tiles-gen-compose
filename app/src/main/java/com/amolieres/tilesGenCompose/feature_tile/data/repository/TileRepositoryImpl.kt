package com.amolieres.tilesGenCompose.feature_tile.data.repository

import androidx.room.Dao
import com.amolieres.tilesGenCompose.feature_tile.data.data_source.TileDao
import com.amolieres.tilesGenCompose.feature_tile.domain.model.Tile
import com.amolieres.tilesGenCompose.feature_tile.domain.repository.TileRepository
import kotlinx.coroutines.flow.Flow

class TileRepositoryImpl(
    private val dao: TileDao
    ) : TileRepository {

    override fun getTiles(): Flow<List<Tile>> {
        return dao.getTiles()
    }

    override suspend fun insertTiles(tiles: List<Tile>) {
        dao.insertTiles(tiles)
    }

    override suspend fun clearTiles() {
        dao.nukeTable()
    }
}
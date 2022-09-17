package com.amolieres.tilesGenCompose.feature_tile.data.data_source

import androidx.room.*
import com.amolieres.tilesGenCompose.feature_tile.domain.model.Tile
import kotlinx.coroutines.flow.Flow

@Dao
interface TileDao {

    @Query("SELECT * FROM tile")
    fun getTiles(): Flow<List<Tile>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTile(tile: Tile)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTiles(tiles: List<Tile>)

    @Query("DELETE FROM tile")
    fun nukeTable()

}
package com.amolieres.tilesGenCompose.feature_tile.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.amolieres.tilesGenCompose.feature_tile.domain.model.Tile

@Database(
    entities = [Tile::class],
    version = 1
)
abstract class TileDatabase: RoomDatabase() {

    abstract val tileDao: TileDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}
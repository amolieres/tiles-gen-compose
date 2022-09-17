package com.amolieres.tilesGenCompose.feature_tile.domain.use_case

import com.amolieres.tilesGenCompose.feature_tile.domain.model.Tile
import com.amolieres.tilesGenCompose.feature_tile.domain.repository.TileRepository
import kotlinx.coroutines.flow.Flow

class GetTiles(
    private val repository: TileRepository
) {

    operator fun invoke(): Flow<List<Tile>> {
        return repository.getTiles()
    }
}
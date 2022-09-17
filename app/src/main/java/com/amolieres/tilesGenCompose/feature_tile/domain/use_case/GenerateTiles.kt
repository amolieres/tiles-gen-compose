package com.amolieres.tilesGenCompose.feature_tile.domain.use_case

import com.amolieres.tilesGenCompose.feature_tile.domain.repository.TileRepository

class GenerateTiles( private val repository: TileRepository) {

    suspend operator fun invoke(tilesCount: Int = 500) {
        repository.clearTiles()

    }

}
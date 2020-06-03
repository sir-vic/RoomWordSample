package com.sirvicks.roomwordsample

import androidx.room.Dao
import androidx.room.Query

interface ProductDao {
    @Query("SELECT * FROM product")
    fun getAllProducts(): List<Product>
}


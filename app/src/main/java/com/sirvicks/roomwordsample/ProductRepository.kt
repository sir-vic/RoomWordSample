package com.sirvicks.roomwordsample

class ProductRepository (private val productDao: ProductDao) {
    val allProduct:List<Product> = productDao.getAllProducts()
}
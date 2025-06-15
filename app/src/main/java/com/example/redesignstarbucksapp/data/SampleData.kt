package com.example.redesignstarbucksapp.data

import com.example.redesignstarbucksapp.model.Category
import com.example.redesignstarbucksapp.model.Product

object SampleData {
    val sampleProducts = listOf(
        Product(
            id = "1",
            name = "Caffe Americano",
            description = "Rich espresso shots topped with hot water create a light layer of crema",
            price = 4.95,
            imageUrl = "americano",
            category = Category.COFFEE
        ),
        Product(
            id = "2",
            name = "Caffe Latte",
            description = "Our dark, rich espresso balanced with steamed milk and light layer of foam",
            price = 5.95,
            imageUrl = "latte",
            category = Category.COFFEE
        ),
        Product(
            id = "3",
            name = "Cappuccino",
            description = "Dark, rich espresso lies in wait under a smoothed layer of thick milk foam",
            price = 5.45,
            imageUrl = "cappuccino",
            category = Category.COFFEE
        ),
        Product(
            id = "4",
            name = "Green Tea Latte",
            description = "Premium matcha green tea mixed with steamed milk",
            price = 5.95,
            imageUrl = "green_tea",
            category = Category.TEA
        ),
        Product(
            id = "5",
            name = "Caramel Frappuccino",
            description = "Caramel syrup meets coffee, milk and ice for a sweet treat",
            price = 6.95,
            imageUrl = "caramel_frap",
            category = Category.FRAPPUCCINO
        ),
        Product(
            id = "6",
            name = "Chocolate Croissant",
            description = "A buttery, flaky croissant filled with rich chocolate",
            price = 3.95,
            imageUrl = "croissant",
            category = Category.FOOD
        )
    )
}

package Services

import Model.Category
import Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS" ,"shirtimage"),
        Category("HOODIES" , "hoodieimage"),
        Category("HATS" , "hatimage"),
        Category("DIGITAL" , "digitalgoodsimage"),
    )

    val hats = listOf(
        Product("Nabigha Graphic beanis" , "Rs 500", "hat01"),
        Product("Nabigha hat black" , "Rs 500", "hat02"),
        Product("Nabigha hat white" , "Rs 500", "hat03"),
        Product("Nabigha hat snapback" , "Rs 500", "hat04")
    )

    val hoodies = listOf(
        Product("Nabigha hoodie gray" , "Rs1000" , "hoodie01"),
        Product("Nabigha hoodie red" , "Rs1000" , "hoodie02"),
        Product("Nabigha hoodie blue" , "Rs1000" , "hoodie03"),
        Product("Nabigha hoodie black" , "Rs1000" , "hoodie04")
    )

    val shirts = listOf(
        Product("Nabigha shirt black" , "Rs800" , "shirt01"),
        Product("Nabigha shirt badge light gray" , "Rs800" , "shirt02"),
        Product("Nabigha shirt logo red" , "Rs800" , "shirt03"),
        Product("Nabigha shirt hustle" , "Rs800" , "shirt04"),
        Product("Nabigha shirt kickflip studio" , "Rs800" , "shirt05")
    )
}
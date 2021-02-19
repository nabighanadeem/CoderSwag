package Services

import Model.Category
import Model.Product

object DataService {
    val categories = listOf(
        Category("HOODIES" , "hoodieimage"),
        Category("SHIRTS" ,"shirtimage"),
        Category("HATS" , "hatimage"),
        Category("DIGITAL" , "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Nabigha Graphic beanis" , "Rs 500", "hat1"),
        Product("Nabigha hat black" , "Rs 500", "hat2"),
        Product("Nabigha hat white" , "Rs 500", "hat3"),
        Product("Nabigha hat snapback" , "Rs 500", "hat4")
    )

    val hoodies = listOf(
        Product("Nabigha hoodie gray" , "Rs1000" , "hoodie1"),
        Product("Nabigha hoodie red" , "Rs1000" , "hoodie2"),
        Product("Nabigha hoodie blue" , "Rs1000" , "hoodie3"),
        Product("Nabigha hoodie black" , "Rs1000" , "hoodie4")
    )

    val shirts = listOf(
        Product("Nabigha shirt black" , "Rs800" , "shirt1"),
        Product("Nabigha shirt badge light gray" , "Rs800" , "shirt2"),
        Product("Nabigha shirt logo red" , "Rs800" , "shirt3"),
        Product("Nabigha shirt hustle" , "Rs800" , "shirt4"),
        Product("Nabigha shirt kickflip studio" , "Rs800" , "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getproducts(category: String) :List<Product>{
        when  (category){
            "SHIRTS" -> return shirts
            "HOODIES" -> return hoodies
            "HATS" -> return hats
            else -> return digitalGood
        }
    }
}
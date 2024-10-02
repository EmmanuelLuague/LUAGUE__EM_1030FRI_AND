package com.example.bottomnavluague

data class ListItem(
    var type: ItemType,
    var text: String? = null,
    var isChecked: Boolean = false
)

enum class ItemType {
    CHECKBOX, TEXTVIEW, IMAGEVIEW
}
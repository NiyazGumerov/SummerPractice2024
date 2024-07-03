package ru.itis.summerpractice24

data class DetailGroup(
    val id: Int,
    val name: String,
    val style: String,
    val url: String,
    val information: String
) {
    fun convertToGroup(detailGroup: DetailGroup): Group {
        return Group(detailGroup.id, detailGroup.name, detailGroup.style, detailGroup.url)
    }

}

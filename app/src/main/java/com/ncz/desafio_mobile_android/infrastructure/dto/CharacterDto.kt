package com.ncz.desafio_mobile_android.infrastructure.dto

import com.google.gson.annotations.SerializedName
import com.ncz.desafio_mobile_android.domain.entities.character.*
import java.io.Serializable
import java.util.Date
import kotlin.collections.ArrayList

data class CharacterDto(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("modified") val modified: Date,
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("urls") val urls: ArrayList<Url>,
    @SerializedName("thumbnail") val thumbnail: Image,
    @SerializedName("comics") val comics: List<ComicList>,
    @SerializedName("stories") val stories: List<StoryList>,
    @SerializedName("events") val events: List<EventList>,
    @SerializedName("series") val series: List<SeriesList>

) : Serializable {
    fun mapToEntity(): Character = Character(
        id = this.id,
        name = this.name,
        description = this.description,
        modified = this.modified,
        resourceURI = this.resourceURI,
        urls = this.urls,
        thumbnail = this.thumbnail,
        comics = this.comics,
        stories = this.stories,
        events = this.events,
        series = this.series
    )
}
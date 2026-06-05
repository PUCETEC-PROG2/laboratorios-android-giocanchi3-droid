package ec.edu.puce.githubclient.Models

import com.google.gson.annotations.SerializedName

data class GithubUser(
    val id: Long,
    val login: String,
    @SerializedName("avatar_url")
    val avatarUrl: String,
)
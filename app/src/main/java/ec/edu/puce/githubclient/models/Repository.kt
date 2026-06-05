package ec.edu.puce.githubclient.Models

import com.google.gson.annotations.SerializedName

data class Repository(
    val id: Long,
    val name: String,
    val description: String?,
    val language: String?,
    val owner: GithubUser,
    @SerializedName("full_name")
    val fullName: String
)
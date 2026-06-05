package ec.edu.puce.githubclient.Models

data class RepositoryPayload(
    val name: String,
    val description: String?,
)

data class UpdateRepositoryPayload(
    val name: String,
    val description: String
)
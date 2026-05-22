package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ec.edu.puce.githubclient.ui.components.RepoItem
import ec.edu.puce.githubclient.models.GithubUser
import ec.edu.puce.githubclient.models.Repository

@Composable
fun RepoList (modifier: Modifier = Modifier) {

    Column (
        modifier = modifier
    ){
        val repository = Repository(
            "123123123",
            "Nombre del repositorio",
            description = "Descripción del repositorio",
            language = "Kotlin",
            owner = GithubUser(
                id = "123123123",
                "@giovanny070",
                "https://github.com/giovanny070/Laboratorio-Android.git"

            )
        )
        RepoItem(repository)
    }
}
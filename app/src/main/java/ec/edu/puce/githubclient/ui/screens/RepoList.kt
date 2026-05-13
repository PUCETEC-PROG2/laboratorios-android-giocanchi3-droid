package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ec.edu.ec.edu.puce.githubclient.ui.components.RepoItem

@Preview(showBackground = true)
@Composable
fun RepoList(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
    ) {

        RepoItem(
            name = "Repositorio de colibri",
            description = "Repositorio creado desarrollo movil",
            avatarUrl = "",
            language = "Kotlin"
        )

        RepoItem(
            name = "Repositorio de colibri",
            description = "Repositorio creado desarrollo movil",
            avatarUrl = "",
            language = "Kotlin"
        )

        RepoItem(
            name = "Repositorio de colibri",
            description = "Repositorio creado desarrollo movil",
            avatarUrl = "",
            language = "Kotlin"
        )

        RepoItem(
            name = "Repositorio de colibri",
            description = "Repositorio creado desarrollo movil",
            avatarUrl = "",
            language = "Kotlin"
        )

    }
}
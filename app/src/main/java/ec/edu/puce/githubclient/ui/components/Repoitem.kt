package ec.edu.puce.githubclient.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import ec.edu.puce.githubclient.Models.GithubUser
import ec.edu.puce.githubclient.Models.Repository
import ec.edu.puce.githubclient.ui.theme.GithubClientTheme

@Composable
fun RepoItem(
    repository: Repository,
    isDeleting: Boolean = false,
    onEditClick: (Repository) -> Unit = {},
    onDeleteClick: (Repository) -> Unit = {}
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = repository.owner.avatarUrl,
                contentDescription = "Imagen de \"${repository.name}\"",
                modifier = Modifier.size(size = 60.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(width = 16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = repository.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(height = 4.dp))
                if (!repository.description.isNullOrEmpty()) {
                    Text(
                        text = repository.description,
                        style = MaterialTheme.typography.bodySmall,
                    )
                }
                Spacer(modifier = Modifier.height(height = 4.dp))
                Text(
                    text = repository.owner.login,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(height = 4.dp))
                if (!repository.language.isNullOrEmpty()) {
                    Text(
                        text = repository.language,
                        style = MaterialTheme.typography.labelSmall,
                    )
                }
            }

            if (isDeleting) {
                CircularProgressIndicator(modifier = Modifier.size(24.dp))
            } else {
                Row(horizontalArrangement = Arrangement.End) {
                    IconButton(onClick = { onEditClick(repository) }) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Editar repositorio",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                    IconButton(onClick = { onDeleteClick(repository) }) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Eliminar repositorio",
                            tint = MaterialTheme.colorScheme.error
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RepoItemPreview() {
    GithubClientTheme {
        val repository = Repository(
            id = 12312414L,
            name = "Nombre del repositorio",
            description = "Descripcion del repositorio",
            language = "Kotlin",
            fullName = "giocanchi3-droid/nombre-del-repositorio",
            owner = GithubUser(
                id = 253741229L,
                login = "giocanchi3-droid",
                avatarUrl = "https://avatars.githubusercontent.com/u/253741229?v=4"
            )
        )
        RepoItem(repository)
    }
}
package forum.desafio.api.forum;

import forum.desafio.api.dadosForum.ForumDados;
import org.jetbrains.annotations.NotNull;


public record Atualizacao(
        @NotNull
        String nome,
        String email,
        String uf,
        String cidade,
        String telefone,
        ForumDados dados) {
}

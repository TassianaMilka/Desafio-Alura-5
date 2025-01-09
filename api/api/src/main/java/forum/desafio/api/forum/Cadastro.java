package forum.desafio.api.forum;


import forum.desafio.api.dadosForum.ForumDados;
import forum.desafio.api.dadosForum.NotBlank;
import org.jetbrains.annotations.NotNull;

public record Cadastro(
        @NotBlank
        Long id,
        @NotBlank
        String nome,
        @NotBlank
        String email,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        @NotBlank
        String telefone,
        @NotNull ForumDados dados) {

}
package forum.desafio.api.dadosForum;


public record ForumDados(
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
        String telefone) {
}


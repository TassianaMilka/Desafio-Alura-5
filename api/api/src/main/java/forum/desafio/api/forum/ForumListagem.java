package forum.desafio.api.forum;

import forum.desafio.api.dadosForum.Forum;

public record ForumListagem(Long id, String nome, String email, String cidade, String uf, String telefone) {


    public ForumListagem (Forum forum){

        this(forum.getId(),forum.getNome(), forum.getEmail(), forum.getCidade(), forum.getUf(), forum.getTelefone());

    }


}

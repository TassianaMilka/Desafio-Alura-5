package forum.desafio.api.controller;

import forum.desafio.api.dadosForum.Forum;
import forum.desafio.api.forum.Atualizacao;
import forum.desafio.api.forum.Cadastro;
import forum.desafio.api.forum.ForumListagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;



@RestController
@RequestMapping("forum")
public class Forumcontroller {


    @Autowired
    private ForumRepository repository;



    @PostMapping
    @Transactional
    public ResponseEntity <Object> Cadastrar(@RequestBody Cadastro dadosnovo) {
        repository.save(new Forum(dadosnovo.dados()));
        return ResponseEntity.status(201).build();
    }


    @GetMapping
    public ResponseEntity<?> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        var page = repository.findAllByAtivoTrue(paginacao).map(ForumListagem::new);
        return ResponseEntity.ok(page);
    }


    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> atualizar(@RequestBody Atualizacao dados) {
        var forum = repository.findById(dados.id())
                .orElseThrow(() -> new RuntimeException("Fórum não encontrado com o ID: " + dados.id()));
        forum.atualizar(dados);
        return ResponseEntity.ok().build();

    }


    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        var forum = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fórum não encontrado com o ID: " + id));

        forum.excluir();
        return ResponseEntity.noContent().build();

    }


}

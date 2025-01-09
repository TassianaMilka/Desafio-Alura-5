package forum.desafio.api.controller;


import forum.desafio.api.dadosForum.Forum;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.lang.ScopedValue;

public interface ForumRepository extends JpaRepository<Forum, Long> {
    Page<Forum> findAllByAtivoTrue(SpringDataWebProperties.Pageable paginacao);

    void save(Forum forum);



}


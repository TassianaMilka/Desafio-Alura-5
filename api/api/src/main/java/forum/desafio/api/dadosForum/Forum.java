package forum.desafio.api.dadosForum;


import forum.desafio.api.forum.Atualizacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

    public class Forum{
        private Long id;
        private String nome;
        private String email;
        private String cidade;
        private String uf;
        private String telefone;


        public Forum(ForumDados dados) {

            this.nome = dados.nome();
            this.email = dados.email();
            this.cidade = dados.cidade();
            this.uf = dados.uf();
            this.telefone = dados.telefone();

        }

        public void atualizar(Atualizacao dados) {


            if (dados.nome() != null) {
                this.nome = dados.nome();
            }
            if (dados.uf() != null) {
                this.email = dados.email();
            }

            if (dados.uf() != null) {
                this.uf = dados.uf();
            }
            if (dados.cidade() != null) {
                this.cidade = dados.cidade();
            }
            if (dados.telefone() != null) {
                this.telefone = dados.telefone();
            }

        }


}



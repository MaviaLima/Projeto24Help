package a24help.com.a24help.entidade;

public class Usuario {

        private String id;
        private String email;
        private String senha;
        private String nome;
        private String sobrenome;
        private String aniversario;
        private String sexo;
        private String telefone;

        public Usuario() {
        }

        public  String getTelefone(){
            return telefone;
        }

        public void setTelefone(){
             this.telefone = telefone ;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public String getAniversario() {
            return aniversario;
        }

        public void setAniversario(String aniversario) {
            this.aniversario = aniversario;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
    }
package aula1.classes.exemplo3_GetSet;

public class Cachorro {

    //Quando temos atributos PRIVADOS, usamos metodos especiais chamados Get e Set para acessar esses atributos.
    //Com isso a mudança desse atributos ficam protegidos

    private String nome;
    private String dono;

    public Cachorro(String nome, String dono) {
        this.nome = nome;
        this.dono = dono;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}

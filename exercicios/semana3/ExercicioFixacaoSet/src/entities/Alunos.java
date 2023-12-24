package entities;

import java.util.Objects;

public class Alunos {

    private Integer codigoUsuario;
    public Alunos(){

    }
    public Alunos(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return Objects.equals(getCodigoUsuario(), alunos.getCodigoUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoUsuario());
    }
}

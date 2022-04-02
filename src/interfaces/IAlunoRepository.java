package interfaces;

import entities.Aluno;

import java.util.List;

public interface IAlunoRepository {
    void create (Aluno aluno) throws Exception;

    void update (Aluno aluno) throws Exception;

    void delete (Aluno aluno) throws Exception;

    List <Aluno> findAll() throws Exception;

    Aluno findById (Integer idAluno) throws Exception;
}

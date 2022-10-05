package com.github.omonteirox.forum.repository;

import com.github.omonteirox.forum.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
    Curso findByNome(String nomeCurso);
}

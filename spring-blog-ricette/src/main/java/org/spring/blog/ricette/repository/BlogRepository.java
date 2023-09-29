package org.spring.blog.ricette.repository;

import org.spring.blog.ricette.model.Ricetta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Ricetta, Integer> {
}

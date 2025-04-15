package org.example.personerest.model.dao;

import org.example.personerest.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long>
{
}

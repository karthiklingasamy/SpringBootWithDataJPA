package com.karthik.springjpaex;

import com.karthik.springjpaex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    /* JPQL Query for complex query opration.

    This is similar to HQL. Because HQL itself implementation of JPQL */

}

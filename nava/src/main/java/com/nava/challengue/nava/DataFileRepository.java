package com.nava.challengue.nava;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataFileRepository extends JpaRepository<DataFile, Integer>{

}

package com.robin.projects.Repository;

import com.robin.projects.Entity.Planes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlaneRepository extends JpaRepository<Planes, Long> {

    Optional<Planes> findByManufacturer(String manufacturer);

}

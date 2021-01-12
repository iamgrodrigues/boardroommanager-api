package com.iamgrodrigues.boardroommanagerapi.repository;

import com.iamgrodrigues.boardroommanagerapi.model.Boardroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardroomRepository extends JpaRepository<Boardroom, Long> {
}

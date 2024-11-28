package com.todo.golfclub.repositories;

import com.todo.golfclub.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

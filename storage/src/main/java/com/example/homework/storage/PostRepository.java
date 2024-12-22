package com.example.homework.storage;

import org.springframework.data.jpa.repository.JpaRepository;

interface PostJpaRepository extends JpaRepository<Post, Long> {

}

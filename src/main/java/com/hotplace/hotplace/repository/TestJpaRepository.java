package com.hotplace.hotplace.repository;

import com.hotplace.hotplace.domain.TbUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestJpaRepository extends JpaRepository<TbUserEntity, Long> {

}

package by.it_academy.jd2.finance.dao.api;

import by.it_academy.jd2.finance.dao.entity.UserEntity;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IUserDao extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByUuid(UUID uuid);
    UserEntity findAllByMail(String mail);
}

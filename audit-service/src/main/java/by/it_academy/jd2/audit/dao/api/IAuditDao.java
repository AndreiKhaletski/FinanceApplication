package by.it_academy.jd2.audit.dao.api;

import by.it_academy.jd2.audit.dao.entity.AuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAuditDao extends JpaRepository<AuditEntity, UUID> {
}

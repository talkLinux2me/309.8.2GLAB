package repository;

import org.apache.catalina.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>
{

    Role findByName(String name);
}


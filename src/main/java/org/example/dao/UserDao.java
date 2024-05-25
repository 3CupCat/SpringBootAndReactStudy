package org.example.dao;

import org.example.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<Users, Integer> {
    // Jpa與Users mapping,因此只能用Users
    // finByMail ==> SELECT * FROM Users WHERE mail = ?
    public List<Users> findByMail(String mail);

    public List<Users> findByMailAndSecret(String mail, String secret);

    @Query("SELECT u.mail FROM users u WHERE u.mail = ?1")
    public List<Users> findByMailJPql(String mail);

}

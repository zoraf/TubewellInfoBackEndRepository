package com.zoraf.Tubewell_Information.Repository;

import com.zoraf.Tubewell_Information.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserModel findAllByEmail(String email);
}

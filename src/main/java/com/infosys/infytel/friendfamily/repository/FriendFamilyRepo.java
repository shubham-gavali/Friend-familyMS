package com.infosys.infytel.friendfamily.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.friendfamily.entity.FriendFamily;

public interface FriendFamilyRepo extends JpaRepository<FriendFamily, Integer> {

	List<FriendFamily> findByPhoneNo(Long phoneNo);
}

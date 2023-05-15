package com.infosys.infytel.friendfamily.service;

import java.util.List;

import com.infosys.infytel.friendfamily.dto.FriendFamilyDto;


public interface FriendFamilyServiceI {

	public void saveFriend(Long phoneNo, FriendFamilyDto friendFamily);
	
	public List<Long> getSpecificFriendFamily(Long phoneNo);
}

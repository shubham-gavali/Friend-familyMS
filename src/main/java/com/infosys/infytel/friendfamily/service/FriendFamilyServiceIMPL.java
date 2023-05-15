package com.infosys.infytel.friendfamily.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.infytel.friendfamily.dto.FriendFamilyDto;
import com.infosys.infytel.friendfamily.entity.FriendFamily;
import com.infosys.infytel.friendfamily.repository.FriendFamilyRepo;

@Service
public class FriendFamilyServiceIMPL implements FriendFamilyServiceI{
	
	
	@Autowired
	FriendFamilyRepo friendFamilyRepo;

	@Override
	public void saveFriend(Long phoneNo, FriendFamilyDto friendDto) {
		friendDto.setPhoneNo(phoneNo);
		FriendFamily friend = friendDto.createFriend();
		
		FriendFamily savedFriend = this.friendFamilyRepo.save(friend);
		
	}
	public List<Long> getSpecificFriendFamily(Long phoneNo){
		
		List<Long> friends=new ArrayList<>();
		List<FriendFamily> friendFamily = this.friendFamilyRepo.findByPhoneNo(phoneNo);
		for(FriendFamily friend : friendFamily) {
			friends.add(friend.getFriendAndFamily());
		}
		return friends;
	}

}

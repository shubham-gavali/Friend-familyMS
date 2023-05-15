package com.infosys.infytel.friendfamily.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.friendfamily.dto.FriendFamilyDto;
import com.infosys.infytel.friendfamily.service.FriendFamilyServiceI;


@RestController
public class FriendFamilyController {

	@Autowired
	private FriendFamilyServiceI friendFamilyService;
	
	
	@PostMapping(value = "/customers/{phoneNo}/friends",consumes  = "application/json")
	public void saveFriendFamily(@PathVariable Long phoneNo,@RequestBody FriendFamilyDto friendDto ) {
		this.friendFamilyService.saveFriend(phoneNo, friendDto);
	}
	
	@GetMapping(value = "/customers/{phoneNo}/friends",produces  = "application/json")
	public List<Long> getSpecificFriendFamily(@PathVariable Long phoneNo ) {
		List<Long> friends = this.friendFamilyService.getSpecificFriendFamily(phoneNo);
		
		return friends;
	}
	
	
	
	
}

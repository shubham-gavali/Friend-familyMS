package com.infosys.infytel.friendfamily.dto;

import com.infosys.infytel.friendfamily.entity.FriendFamily;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendFamilyDto {

	Long phoneNo;
	Long friendAndFamily;

	// Converts DTO into Entity
	public FriendFamily createFriend() {
		FriendFamily friend = new FriendFamily();
		friend.setPhoneNo(this.getPhoneNo());
		friend.setFriendAndFamily(this.getFriendAndFamily());
		return friend;
	}
	
}

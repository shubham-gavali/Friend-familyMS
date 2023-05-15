package com.infosys.infytel.friendfamily.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FriendFamily {

	@Id
	@GeneratedValue
	int id;

	@Column(name = "phone_no")
	Long phoneNo;

	@Column(name = "friend_and_family")
	Long friendAndFamily;
}

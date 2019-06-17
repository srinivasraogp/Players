package com.hcl.players.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString

public class PlayerResDto implements Serializable {

	private Long playerId;
	@JsonProperty
	private String playerName;
	@JsonProperty
	private String playerState;
	@JsonProperty
	private int playerAge;
	@JsonProperty
	private String playerRole;
	@JsonProperty
	private Double playerPoints;

}

package com.sape.net.json.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.benchresources.cdm.player.PlayerListType;
import in.benchresources.cdm.player.PlayerType;

@Path("/playerservice")
public interface IPlayerService {

	// Basic CRUD operations for Player Service

	// http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/addplayer
	@POST
	@Path("addplayer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_FORM_URLENCODED)
	public String createOrSaveNewPLayerInfo(PlayerType playerType);

	// http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/getplayer/564
	@GET
	@Path("getplayer/{id}")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public PlayerType getPlayerInfo(@PathParam("id") int playerId);

	// http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/updateplayer
	@PUT
	@Path("updateplayer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_FORM_URLENCODED)
	public String updatePlayerInfo(PlayerType playerType);

	// http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/deleteplayer
	@DELETE
	@Path("deleteplayer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_FORM_URLENCODED)
	public String deletePlayerInfo(PlayerType playerType);

	// http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/getallplayer
	@GET
	@Path("getallplayer")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public PlayerListType getAllPlayerInfo();
}
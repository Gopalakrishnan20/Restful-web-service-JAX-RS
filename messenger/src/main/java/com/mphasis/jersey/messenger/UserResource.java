package com.mphasis.jersey.messenger;

import java.util.Collection;

import com.mphasis.jersey.messenger.domain.User;
import com.mphasis.jersey.messenger.service.UserService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("users")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class UserResource {
	
	private UserService serv=new UserService();
	
	@GET
	public Collection<User> getAllUsers(){
		System.out.println("In GetAllUsers Method");
		return serv.getAllUsers();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllUsersInString(){
		System.out.println("In GetAllUsers Method");
		return serv.getAllUsers().toString();
	}
	
	@Path("{userId}")
	@GET
	public User getUserById(@PathParam("userId") int userId) {
		return serv.getUserById(userId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUser(User user) {
		serv.addUser(user);
		return Response.status(Status.CREATED).entity(user).build();
		
	}
	
	@Path("{userId}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateUser(@PathParam("userId")int userId, User user) {
		serv.updateUserById(userId, user);
		return Response.status(Status.NO_CONTENT).build();
	}
	@Path("{userId}")
	@DELETE
	public Response updateUser(@PathParam("userId")int userId) {
		serv.deleteUserById(userId);
		return Response.status(Status.OK).entity("Deleted Successfully").build();
	}
}

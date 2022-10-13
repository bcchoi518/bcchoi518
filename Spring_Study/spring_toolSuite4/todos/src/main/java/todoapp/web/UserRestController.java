package todoapp.web;

import java.util.Objects;

import javax.annotation.security.RolesAllowed;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import todoapp.security.UserSession;
import todoapp.web.model.UserProfile;

@RestController
public class UserRestController {
	
	@GetMapping("/api/user/profile")
	@RolesAllowed("ROLE_USER")
	public ResponseEntity<UserProfile> userProfile(UserSession userSession) {
		if (Objects.nonNull(userSession)) {
			return ResponseEntity.ok(new UserProfile(userSession.getUser()));
		}//if
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}//userProfile
}//UserRestController

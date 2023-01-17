package todoapp.web;

import java.io.IOException;
import java.net.URI;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import todoapp.core.user.application.ProfilePictureChanger;
import todoapp.core.user.domain.ProfilePicture;
import todoapp.core.user.domain.ProfilePictureStorage;
import todoapp.core.user.domain.User;
import todoapp.security.UserSession;
import todoapp.security.UserSessionRepository;
import todoapp.web.model.UserProfile;

@RestController
@RolesAllowed("ROLE_USER")
public class UserRestController {
	
	private final ProfilePictureChanger profilePictureChanger;
	private final ProfilePictureStorage profilePictureStorage;
	private final UserSessionRepository userSessionRepository;
	
	public UserRestController(ProfilePictureChanger profilePictureChanger, ProfilePictureStorage profilePictureStorage, UserSessionRepository userSessionRepository) {
		this.profilePictureChanger = profilePictureChanger;
		this.profilePictureStorage = profilePictureStorage;
		this.userSessionRepository = userSessionRepository;
	}

	@GetMapping("/api/user/profile")
	public UserProfile userProfile(UserSession userSession) {
		return new UserProfile(userSession.getUser());
	}//userProfile
	
	@PostMapping("/api/user/profile-picture")
	public UserProfile changeProfilePicture(MultipartFile profilePicture, UserSession userSession) throws IOException {
		// 1. 업로드된 프로필 이미지 파일 저장하기
		URI profilePictureUri = profilePictureStorage.save(profilePicture.getResource());
		
		// 2. 프로필 이미지 변경 후 세션을 갱신
		User updatedUser = profilePictureChanger.change(userSession.getName(), new ProfilePicture(profilePictureUri));
		userSessionRepository.set(new UserSession(updatedUser));
		
		return new UserProfile(updatedUser);
	}//changeProfilePicture
}//UserRestController

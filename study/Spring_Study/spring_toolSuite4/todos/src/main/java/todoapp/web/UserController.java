package todoapp.web;

import java.io.IOException;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

import todoapp.core.user.domain.ProfilePicture;
import todoapp.core.user.domain.ProfilePictureStorage;
import todoapp.security.UserSession;

@Controller
public class UserController {
	
	@RequestMapping("/user/profile-picture")
	@RolesAllowed("ROLE_USER")
	public ProfilePicture profilePicture(UserSession userSession) throws IOException {
		return userSession.getUser().getProfilePicture();
	}//profilePicture
	
	
	public static class ProfilePictureReturnValueHandler implements HandlerMethodReturnValueHandler {

		private final ProfilePictureStorage profilePictureStorage;
		
		public ProfilePictureReturnValueHandler(ProfilePictureStorage profilePictureStorage) {
			this.profilePictureStorage = profilePictureStorage;
		}

		@Override
		public boolean supportsReturnType(MethodParameter returnType) {
			return ProfilePicture.class.isAssignableFrom(returnType.getParameterType());
		}//supportsReturnType

		@Override
		public void handleReturnValue(Object returnValue, MethodParameter returnType,
				ModelAndViewContainer mavContainer, NativeWebRequest webRequest) throws Exception {
			HttpServletResponse response = webRequest.getNativeResponse(HttpServletResponse.class);
			Resource profilePicture = profilePictureStorage.load(((ProfilePicture) returnValue).getUri());
			profilePicture.getInputStream().transferTo(response.getOutputStream());
		}//handleReturnValue
		
	}//ProfilePictureReturnValueHandler
}//UserController

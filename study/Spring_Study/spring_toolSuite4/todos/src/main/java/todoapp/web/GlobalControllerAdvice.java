package todoapp.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import todoapp.web.model.SiteProperties;

@ControllerAdvice
public class GlobalControllerAdvice {

	private final SiteProperties siteProperties;

	public GlobalControllerAdvice(SiteProperties siteProperties) {
		this.siteProperties = siteProperties;
	}
	
	@ModelAttribute("site")
	public SiteProperties siteProperties() {
		return siteProperties;
	}//siteProperties
	
//	@ExceptionHandler(UnauthorizedAccessException.class)
//	public ResponseEntity<Map<String, Object>> handleUnauthorizedAccessException(UnauthorizedAccessException error) {
//		Map<String, Object> attributes = new HashMap<>();
//		attributes.put("error", error.getClass().getSimpleName());
//		attributes.put("message", error.getMessage());
//		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(attributes);
//	}//handleUnauthorizedAccessException
//	
//	@ExceptionHandler(AccessDeniedException.class)
//	public ResponseEntity<Map<String, Object>> handleAccessDeniedException(AccessDeniedException error) {
//		Map<String, Object> attributes = new HashMap<>();
//		attributes.put("error", error.getClass().getSimpleName());
//		attributes.put("message", error.getMessage());
//		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(attributes);
//	}//handleAccessDeniedException
}//GlobalControllerAdvice

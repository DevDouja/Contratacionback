package com.devseguro.contratacionback.chatbot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties(prefix = "ibm.watson.assistant")
@Validated
public class WatsonAssistantConfig {
	
	//@NotNull(message = "La clave de api es obligatoria")
	//@NotBlank(message = "La clave de api es obligoria")
	//@Pattern(regexp = "[a-z-A-Z0-9-]*", message = "El id de asistente tiene caracteres no válidos")
	private String apikey;
	
	//@NotNull(message = "El id de asistente es obligatorio")
	//@NotBlank(message = "El id de asistente es obligorio")
	//@Pattern(regexp = "[a-z-A-Z0-9-]*", message = "El id de asistente tiene caracteres no válidos")
	private String id;
	
	//@NotNull(message = "La url es obligatoria")
	//@NotBlank(message = "La url es obligatoria")
	//@Pattern(
    //        regexp = "https:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&\\/\\/=]*)",
    //        message = "La url del servicio contiene errores"
    //)
	private String url;
	
	//@NotNull(message = "La fecha de version es obligatoria")
	//@NotBlank(message = "La fecha de version es obligatoria")
	//@Pattern(
    //        regexp = "^\\d{4}(-)(((0)[0-9])|((1)[0-2]))(-)([0-2][0-9]|(3)[0-1])$",
    //        message = "La fecha de versión contiene errores, debe tener el formato DD-MM-AAAA"
    //)
	private String versionDate;
	
	public String getApikey() {
		return apikey;
	}
	
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getVersionDate() {
		return versionDate;
	}
	
	public void setVersionDate(String versionDate) {
		this.versionDate = versionDate;
	}
	
	
	

}

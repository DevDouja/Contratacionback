package com.devseguro.contratacionback.chatbot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devseguro.contratacionback.chatbot.configuration.WatsonAssistantMessage;
import com.devseguro.contratacionback.chatbot.services.WatsonAssistantService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping("/bot")
@CrossOrigin
public class WatsonAssistantController {
	
	private WatsonAssistantService watsonAssistantService;

    @Autowired
    public WatsonAssistantController(WatsonAssistantService watsonAssistantService) {
        this.watsonAssistantService = watsonAssistantService;
    }
	
	@RequestMapping(value="/send", method = RequestMethod.GET)
	public JsonNode send(@RequestParam("message") String message) throws JsonProcessingException {

        WatsonAssistantMessage response;
        response = watsonAssistantService.sendMessage(message);

        return response.getGeneric();

    }

}

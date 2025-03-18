package com.gopinath.genai_demo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.stereotype.Service;

@Service
public class OllamaService {

    private ChatClient chatClient;

    public OllamaService(ChatClient.Builder builder)
    {
        chatClient = builder.build();
        //chatClient = builder.defaultAdvisors(new MessageChatMemoryAdvisor
                //(new InMemoryChatMemory())).build();
    }

    public String askMe(String question)
    {
        return chatClient.prompt(question).call().content();
    }
}

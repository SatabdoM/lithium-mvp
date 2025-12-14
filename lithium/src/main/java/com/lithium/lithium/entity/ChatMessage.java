package com.lithium.lithium.entity;

import com.lithium.lithium.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    ChatSession session;
    String content;

    MessageRole role;

    String toolCalls;
    Integer tokensUsed;
    Instant createdAt;
}

package study.chat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PublishMessage {
    private Long roomId;
    private Long senderId;
    private String content;
}

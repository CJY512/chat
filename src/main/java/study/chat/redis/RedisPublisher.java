package study.chat.redis;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;
import study.chat.entity.PublishMessage;

@Service
@RequiredArgsConstructor
public class RedisPublisher {

    @Resource(name = "chatRedisTemplate")
    private final RedisTemplate<String, Object> redisTemplate;

    public void publish(ChannelTopic topic, PublishMessage message) {
        redisTemplate.convertAndSend(topic.getTopic(), message);
    }
}

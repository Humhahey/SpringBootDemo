package cn.humhahey.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class CountController {
    private static int count = 1;
    @Autowired
    RedisTemplate redisTemplate;

    //10秒内只允许响应10次
    @GetMapping("/count/{id}")
    public String count(@PathVariable Long id) {
        String key = ""+id;
        if (redisTemplate.opsForValue().get(key) == null) {
            redisTemplate.opsForValue().set(key, "1", 10, TimeUnit.SECONDS);
            log.info("响应成功，第{}次请求", count++);
        } else if (redisTemplate.opsForValue().increment(key, 1) <= 10) {
            log.info("响应成功，第{}次请求", count++);
        } else {
            log.info("拒绝响应，第{}次请求", count++);
        }
        return redisTemplate.opsForValue().get(key).toString();
    }
}


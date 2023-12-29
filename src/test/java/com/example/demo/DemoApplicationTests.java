package com.example.demo;

import com.example.demo.question.Question;
import com.example.demo.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void test01() {
        Question q = new Question();
        q.setSubject("제목");
        q.setContent("내용내용내용");
        q.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q);
    }

    @Test
    void test02() {
        List<Question> all = this.questionRepository.findAll();
        assertEquals(1,all.size());
    }

}

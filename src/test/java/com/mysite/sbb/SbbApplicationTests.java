package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;
    @Transactional
    @Test
    void testJpa() {
        Question question = new Question();
        question.setSubject("렉토가 누구인가요?");
        question.setContent("대충 알랴줘");
        question.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(question);
        question=questionRepository.findBySubject("렉토가 누구인가요?");
        assertEquals("대충 알랴줘", question.getContent());
    }

}

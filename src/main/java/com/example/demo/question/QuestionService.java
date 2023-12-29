package com.example.demo.question;

import com.example.demo.DataNotException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> list(){
        return this.questionRepository.findAll();
    }
    public Question findQuestionById(Integer id){
        Optional<Question> oq = this.questionRepository.findById(id);
        if(oq.isPresent()){
            return oq.get();
        }else {
            throw new DataNotException("question not found");
        }
    }
}

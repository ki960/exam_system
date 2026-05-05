package com.atguigu.exam.service;

import com.atguigu.exam.vo.AiGenerateRequestVo;
import com.atguigu.exam.vo.QuestionImportVo;

import java.util.List;

public interface DoubaoAiService {

    String buildPrompt(AiGenerateRequestVo request);

    String callDoubaoAi(String prompt) throws InterruptedException;
}

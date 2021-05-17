package com.java171.ssmpractice;

import com.java171.ssmpractice.common.ResultData;
import com.java171.ssmpractice.common.StatusCode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SsmPracticeApplicationTests {

    @Test
    void contextLoads() {
        ResultData resultData1=ResultData.succeed("a",new int[]{1,2,3});
        ResultData resultData2=ResultData.succeed("b",new int[]{3,2,1});
        System.out.println("helloWord");
    }
}


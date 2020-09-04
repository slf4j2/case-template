package com.soho.template.main;

import com.soho.template.utils.GZIPUtils;

import java.io.IOException;

/**
 * @author soho.chan
 * @date 4/9/2020 18:43
 * @description TODO
 */
public class GZIPTest {

    public static void main(String[] args) throws IOException {
        String s = "asdfdasfdsareradfadsfasdsdsssssssssssssssssssssssssssssssssssssfaw432423wsadf234fasdfasdfasdfadfasdfadsfasdfadfadsfasdfsssasdfdsafdasfsadtre435324123sss";
        System.out.println("字符串长度：" + s.length());
        System.out.println("压缩后：" + GZIPUtils.compress(s).length);
    }

}

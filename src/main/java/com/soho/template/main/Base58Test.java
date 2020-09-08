package com.soho.template.main;

import com.soho.template.utils.Base58Utils;

/**
 * @author soho.chan
 * @date 4/9/2020 18:14
 * @description TODO
 */
public class Base58Test {

    public static void main(String[] args) {
        String encode = Base58Utils.encode("8890");
        System.out.println(encode);

        String decode = Base58Utils.decodeToString(encode);
        System.out.println(decode);
    }

}

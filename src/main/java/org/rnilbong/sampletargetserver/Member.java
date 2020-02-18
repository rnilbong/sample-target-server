package org.rnilbong.sampletargetserver;

import lombok.ToString;

@ToString
public class Member {

    String id;
    String pw;
    int age;

    Member(String id, String pw, int age) {
        this.id = id;
        this.pw = pw;
        this.age = age;
    }
}

package com.example.study.repository;

import com.example.study.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    // JPA꺼 아님!! 상속 안받음.
    List<Member> findByName(String name);

    List<Member> findUser(String nameParam, Integer ageParam);
}

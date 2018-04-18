package com.nhnent.benjamin.dao;

import org.springframework.stereotype.Repository;

// TODO : remove mybatis
@Deprecated
@Repository
public class MemberDao {
/*
    private static final String NAMESPACE = "memberDao.";


    @Autowired
    SqlSessionTemplate sqlSessionTemplate;


    public Member exist(String email, String password) {
        Member member = new Member();
        member.setEmail(email);
        member.setPassword(password);

        return sqlSessionTemplate.selectOne(NAMESPACE + "selectMemberExist", member);
    }

    public int insert(Member member) throws Exception {
        return sqlSessionTemplate.insert(NAMESPACE + "insertMember", member);
    }

    public List<Member> selectList() throws Exception {
        return sqlSessionTemplate.selectList(NAMESPACE + "selectMemberList");
    }

    public Member selectOne(int no) throws Exception {
        return sqlSessionTemplate.selectOne(NAMESPACE + "selectMember", no);
    }

    public int update(Member member) throws Exception {
        return sqlSessionTemplate.update(NAMESPACE + "updateMember", member);
    }

    public int delete(int no) throws Exception {
        return sqlSessionTemplate.delete(NAMESPACE + "deleteMember", no);
    }
*/

}

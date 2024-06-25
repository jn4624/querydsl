package study.querydsl.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import study.querydsl.entity.Member;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class MemberBasicRepositoryTest {
    @Autowired
    private MemberBasicRepository memberBasicRepository;

    @Test
    void basicTest() {
        Member member = new Member("member", 10);
        memberBasicRepository.save(member);

        Member findMember = memberBasicRepository.findById(member.getId()).get();
        assertThat(findMember).isEqualTo(member);

        List<Member> result1 = memberBasicRepository.findAll();
        assertThat(result1).containsExactly(member);

        List<Member> result2 = memberBasicRepository.findByUsername(member.getUsername());
        assertThat(result2).containsExactly(member);
    }
}
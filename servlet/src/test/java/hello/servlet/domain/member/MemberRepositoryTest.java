package hello.servlet.domain.member;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance(); //싱글톤

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }
    

    @Test
    void save() {
        //given
        Member member = new Member("pleatin", 22);

        //when
        Member savedmember = memberRepository.save(member);

        //then
        assertThat(savedmember).isEqualTo(member);
    }
    
    @Test
    void findAll() {
        //given
        Member member1 = new Member("pleatin", 22);
        Member member2 = new Member("pleataxi", 23);

        memberRepository.save(member1);
        memberRepository.save(member2);

        //when
        List<Member> result = memberRepository.findAll();
        
        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(member1, member2);
    }
}
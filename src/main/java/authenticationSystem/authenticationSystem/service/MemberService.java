package authenticationSystem.authenticationSystem.service;

import authenticationSystem.authenticationSystem.domain.Member;
import authenticationSystem.authenticationSystem.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member register(Member member){
        return memberRepository.save(member);
    }
}
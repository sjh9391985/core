package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

//    public MemberServiceImpl(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    } // 구현체에 있는 repository가 호출

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

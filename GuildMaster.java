public class GuildMaster {
    public static void main(String[]args){
        Member member = new Member("Alice");
        member.promote();
        System.out.println("member:"+member.getName()+",Rank"+member.getRank());
    }
}
class Member{
    private String name;
    private int rank;

    public Member(String name){
        this.name = name;
        this.rank = 1;
    }
    public void promote(){
        rank++;
    }
    public String getName(){
        return name;
    }
    public int getRank(){
        return rank;
    }
}
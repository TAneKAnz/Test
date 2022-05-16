package java.card;


public class DaimondCard extends MemberCard {
    @Override
    public float discount(float amount) {
        return .2f;
    }

    @Override
    public float rewardPoint() {
        return 5f;
    }

    @Override
    public boolean accessLounge() {
        return true;
    }
    
}

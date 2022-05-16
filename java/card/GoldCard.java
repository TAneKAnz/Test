package java.card;

public final class GoldCard extends MemberCard {

    @Override
    public float rewardPoint() {
        return 2f;
    }

    @Override
    public boolean accessLounge() {
        return false;
    }
    
}

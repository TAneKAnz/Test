package java.card;

public final class SilverCard extends MemberCard {
    @Override
    public float discount(float amount) {
        if (amount >= 3000) {
            return amount * .03f;
        } else {
            return 0f;
        }
    }

    @Override
    public float rewardPoint() {
        return 1f;
    }

    @Override
    public boolean accessLounge() {
        return false;
    }
}

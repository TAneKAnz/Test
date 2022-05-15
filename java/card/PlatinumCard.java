package java.card;
public final class PlatinumCard extends MemberCard {
    @Override
    public float discount(float amount) {
        return amount * .05f;
    }

    @Override
    public float rewardPoint() {
        return 3f;
    }
}

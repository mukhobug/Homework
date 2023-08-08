public class Hogwarts {
    private String name;
    private int castSpell;
    private int apparition;

    public Hogwarts(String name, int castSpell, int apparition) {
        this.name = name;
        this.castSpell = castSpell;
        this.apparition = apparition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCastSpell() {
        return castSpell;
    }

    public void setCastSpell(int castSpell) {
        this.castSpell = castSpell;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }

    public void compare(Hogwarts s) {
        int sum1 = this.apparition + this.castSpell;
        int sum2 = s.apparition + s.castSpell;
        if (sum1 > sum2) {
            System.out.printf("%s лучше маг, чем %s\n", this.name, s.name);
        } else if (sum1 < sum2) {
            System.out.printf("%s лучше маг, чем %s\n", s.name, this.name);
        } else {
            System.out.printf("%s и %s одинаково хороши в магии\n", this.name, s.name);
        }
    }

    @Override
    public String toString() {
        return "Faculty " + this.getClass().getName() + ": "
                + name +
                ", castSpell " + castSpell +
                ", apparition " + apparition;
    }
}
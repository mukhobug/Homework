public class RavenclawStudent extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creative;

    public RavenclawStudent(String name, int castSpell, int apparition, int intelligence, int wisdom, int wit, int creative) {
        super(name, castSpell, apparition);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public void compare(RavenclawStudent s) {
        int sum1 = this.intelligence + this.wisdom + this.wit + this.creative;
        int sum2 = s.intelligence + s.wisdom + s.wit + s.creative;
        if (sum1 > sum2) {
            System.out.printf("%s лучше Когтевранец, чем %s\n", this.getName(), s.getName());
        } else if (sum1 < sum2) {
            System.out.printf("%s лучше Когтевранец, чем %s\n", s.getName(), this.getName());
        } else {
            System.out.printf("%s и %s одинаково хорошие Когтевранцы\n", this.getName(), s.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", intelligence " + intelligence +
                ", wisdom " + wisdom +
                ", wit " + wit +
                ", creative " + creative;
    }
}

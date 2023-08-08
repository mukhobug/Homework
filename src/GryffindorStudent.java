public class GryffindorStudent extends Hogwarts {
    private int chivalry;
    private int honor;
    private int courage;

    public GryffindorStudent(String name, int castSpell, int apparition, int chivalry, int honor, int courage) {
        super(name, castSpell, apparition);
        this.chivalry = chivalry;
        this.honor = honor;
        this.courage = courage;
    }

    public int getChivalry() {
        return chivalry;
    }

    public void setChivalry(int chivalry) {
        this.chivalry = chivalry;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void compare(GryffindorStudent s) {
        int sum1 = this.chivalry + this.courage + this.honor;
        int sum2 = s.chivalry + s.courage + s.honor;
        if (sum1 > sum2) {
            System.out.printf("%s лучше Гриффиндорец, чем %s\n", this.getName(), s.getName());
        } else if (sum1 < sum2) {
            System.out.printf("%s лучше Гриффиндорец, чем %s\n", s.getName(), this.getName());
        } else {
            System.out.printf("%s и %s одинаково хорошие Грифиндорцы\n", this.getName(), s.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", chivalry " + chivalry +
                ", honor " + honor +
                ", courage " + courage;
    }
}

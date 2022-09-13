public class HufflepuffStudent extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int justice;

    public HufflepuffStudent(String name, int castSpell, int apparition, int hardWork, int loyalty, int justice) {
        super(name, castSpell, apparition);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.justice = justice;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getJustice() {
        return justice;
    }

    public void setJustice(int justice) {
        this.justice = justice;
    }

    public void compare(HufflepuffStudent s) {
        int sum1 = this.hardWork + this.justice + this.loyalty;
        int sum2 = s.hardWork + s.justice + s.loyalty;
        if (sum1 > sum2) {
            System.out.printf("%s лучше Пуфендуец, чем %s\n", this.getName(), s.getName());
        } else if (sum1 < sum2) {
            System.out.printf("%s лучше Пуфендуец, чем %s\n", s.getName(), this.getName());
        } else {
            System.out.printf("%s и %s одинаково хорошие Пуфендуйцы\n", this.getName(), s.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hardWork " + hardWork +
                ", loyalty " + loyalty +
                ", justice " + justice;
    }
}

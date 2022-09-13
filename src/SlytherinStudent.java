public class SlytherinStudent extends Hogwarts {
    private int cunning;
    private int resolute;
    private int ambition;
    private int resourcefulness;
    private int leadership;

    public SlytherinStudent(String name, int castSpell, int apparition, int cunning, int resolute, int ambition, int resourcefulness, int leadership) {
        super(name, castSpell, apparition);
        this.cunning = cunning;
        this.resolute = resolute;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.leadership = leadership;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    public void compare(SlytherinStudent s) {
        int sum1 = this.cunning + this.resolute + this.ambition + this.resourcefulness + this.leadership;
        int sum2 = s.cunning + s.resolute + s.ambition + s.resourcefulness + s.leadership;
        if (sum1 > sum2) {
            System.out.printf("%s лучше Слизеринец, чем %s\n", this.getName(), s.getName());
        } else if (sum1 < sum2) {
            System.out.printf("%s лучше Слизеринец, чем %s\n", s.getName(), this.getName());
        } else {
            System.out.printf("%s и %s одинаково хорошие Слизеринцы\n", this.getName(), s.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cunning " + cunning +
                ", resolute " + resolute +
                ", ambition " + ambition +
                ", resourcefulness " + resourcefulness +
                ", leadership " + leadership;
    }
}

public class Main {
    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Гарри Поттер", genRand(), genRand(), genRand(), genRand(), genRand());
        GryffindorStudent hermione = new GryffindorStudent("Гермиона Грейнджер", genRand(), genRand(), genRand(), genRand(), genRand());
        GryffindorStudent ronald = new GryffindorStudent("Рон Уизли", genRand(), genRand(), genRand(), genRand(), genRand());

        SlytherinStudent draco = new SlytherinStudent("Драко Малфой", genRand(), genRand(), genRand(), genRand(), genRand(), genRand(), genRand());
        SlytherinStudent graham = new SlytherinStudent("Грэхэм Монтегю", genRand(), genRand(), genRand(), genRand(), genRand(), genRand(), genRand());
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл", genRand(), genRand(), genRand(), genRand(), genRand(), genRand(), genRand());

        HufflepuffStudent zacharias = new HufflepuffStudent("Захария Смит", genRand(), genRand(), genRand(), genRand(), genRand());
        HufflepuffStudent cedric = new HufflepuffStudent("Седрик Диггори", genRand(), genRand(), genRand(), genRand(), genRand());
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", genRand(), genRand(), genRand(), genRand(), genRand());

        RavenclawStudent cho = new RavenclawStudent("Чжоу Чанг", genRand(), genRand(), genRand(), genRand(), genRand(), genRand());
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", genRand(), genRand(), genRand(), genRand(), genRand(), genRand());
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", genRand(), genRand(), genRand(), genRand(), genRand(), genRand());

        harry.compare(hermione);
        System.out.println(hermione);
        System.out.println(harry);
        System.out.println(draco);
        harry.compare(draco);
        harry.compare(harry);
    }

    public static int genRand() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(100);
    }
}
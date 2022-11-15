package academy.devdojo.javacore.ZZGconcorrencia.dominio;
public class Discount {
    public enum code {
        NONE(0), SUPER_SAYAJIN(5),SUPER_SAYAJIN1(10),SUPER_SAYAJIN2(15);
        private final int porcentage;

        code(int porcentage) {
            this.porcentage = porcentage;
        }

        public int getPorcentage() {
            return porcentage;
        }
    }
}

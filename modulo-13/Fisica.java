public class Fisica  extends Pessoa{
    private String cfp;

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + (cfp == null ? "n/a" : cfp);
    }
}

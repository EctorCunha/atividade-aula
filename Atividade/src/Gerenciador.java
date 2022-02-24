public abstract class Gerenciador {

    // Atributo
    protected Gerenciador gerenciadorSeguinte;

    // Get e Set
    public Gerenciador getSeguinte(){
        return this.gerenciadorSeguinte;
    }

    public void setSeguinte(Gerenciador g){
        this.gerenciadorSeguinte = g;
    }

    // Método
    public abstract void verificar(Mail mail);
}

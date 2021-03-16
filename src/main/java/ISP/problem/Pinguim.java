package ISP.problem;

public class Pinguim implements Ave {

    @Override
    public void bicar() {
        //consegue bicar
    }

    @Override
    public void chocarOvos() {
        //consegue por ovos
    }

    @Override
    public void voar() {
        //Nao consegue voar, aqui há uma violacao do principio.
    }
}
